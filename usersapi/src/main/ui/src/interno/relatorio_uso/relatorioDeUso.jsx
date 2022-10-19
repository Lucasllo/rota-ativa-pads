import { Box, Flex, SkeletonText } from "@chakra-ui/react";
import {
  useJsApiLoader,
  GoogleMap,
  Polygon,
  Marker,
} from "@react-google-maps/api";
import { useEffect, useMemo, useState } from "react";
import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import dados from "../map/json.json";
import VagaService from "../../service/vaga";
import Pagination from "../../components/Paginacao/Pagination";
import { Link } from "react-router-dom";

const center = { lat: -3.735015, lng: -38.494695 };

let PageSize = 5;

export function RelatorioDeUso() {
 
    const vagaService = new VagaService();

    const [vagas, setVagas] = useState([])
    const [currentPage, setCurrentPage] = useState(1);

    useEffect(() => {
        vagaService.getVaga().then((resp) => setVagas(resp.data));
    }, [])

    const currentTableData = useMemo(() => {
        const firstPageIndex = (currentPage - 1) * PageSize;
        const lastPageIndex = firstPageIndex + PageSize;
        return vagas.slice(firstPageIndex, lastPageIndex);
    }, [currentPage, vagas]);


  const { isLoaded } = useJsApiLoader({
    googleMapsApiKey: "AIzaSyAQYGeShstIRAbsrS4lwyumbLwlG5t-sTA",
    libraries: ["places"],
  });

  const [showInfoWindow, setShowInfoWindow] = useState(false);

  if (!isLoaded) {
    return <SkeletonText />;
  }

  return (
    <>
      <Sidebar />
      <Topbar />
      <div>
        <Flex h="50vh" className="margem-esq">
          <Box h="100%" w="100%">
            <GoogleMap
              center={center}
              zoom={15}
              mapContainerStyle={{ width: "100%", height: "100%" }}
            >
              {dados.map((d) => {

                var x = vagas.find((p) => p.rua_avenida == d.rua_avenida );
                
                return (
                  <>
                    <Polygon
                      options={{ strokeColor: x?.usuarios?.length > 3 ? "#FF5858" : "#027373", strokeWeight: 2 }}
                      onClick={() => {
                        setShowInfoWindow(true);
                      }}
                      paths={d.path}
                    ></Polygon>
                  </>
                );
              })}
              {showInfoWindow && (
                <Marker
                  position={{ lat: -22.618827234831404, lng: -42.57636812499999 }}
                ></Marker>
              )}
            </GoogleMap>
          </Box>
        </Flex>

        <div className="card margem-relatorio">
                <div className="card-body">
                    <h1 className="py-3 text-center font-bold font-up blue-text">
                        Vagas Mais Usadas
                    </h1>
                    <table class="table table-hover table-responsive mb-0">
                        <thead>
                            <tr>
                                <th scope="row">#</th>
                                <th class="th-lg">Nome</th>
                                <th class="th-lg">Crédito</th>
                                <th class="th-lg">Total do veículos</th>
                                <th class="th-lg">Tempo de uso</th>
                            </tr>
                        </thead>
                        <tbody>
                            {currentTableData.map((item) => {
                                var tempo = 0;
                                var credito = 0;
                                var veiculos = 0;
                                item.usuarios.forEach(element => {
                                    tempo += element.tempo_uso
                                    credito += element.credito
                                    veiculos += element.veiculo.length
                                })
                                return (
                                    <tr>
                                        <td>{item.id}</td>
                                        <td>
                                            <Link to={{ pathname: `/menulogado/relatorioUsuarios/${item.id}` }}
                                                state={{ vaga: item}}>
                                                {item.rua_avenida} - {item.Bairro}
                                            </Link>
                                        </td>
                                        <td>{credito}</td>
                                        <td>{veiculos}</td>
                                        <td>{tempo} h</td>
                                    </tr>
                                )
                            })}
                        </tbody>
                    </table>
                    <Pagination
                        currentPage={currentPage}
                        totalCount={vagas.length}
                        pageSize={PageSize}
                        onPageChange={page => setCurrentPage(page)}
                    />
                </div>
            </div>
      </div>
    </>
  );
}