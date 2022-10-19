import { Box, Flex, SkeletonText } from "@chakra-ui/react";
import {
  useJsApiLoader,
  GoogleMap,
  Polygon,
  Marker,
} from "@react-google-maps/api";
import { useEffect, useLayoutEffect, useMemo, useState } from 'react';
import Pagination from '../../components/Paginacao/Pagination';
import VagaService from '../../service/vaga';
import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import './relatorioUsuario.css'
import dados from "../map/json.json";
import { Link, useLocation, useNavigate } from 'react-router-dom';

const center = { lat: -3.735015, lng: -38.494695 };
let PageSize = 5;
var x;

export function RelatorioUsuario() {
    const location = useLocation();
    const navigate = useNavigate();

    const [usuarios, setUsuarios] = useState([])
    const [currentPage, setCurrentPage] = useState(1);

    useEffect(() => {
            setUsuarios(location.state.vaga.usuarios)
    }, [])
    
    x = dados.find((p) => p.rua_avenida == location.state.vaga.rua_avenida );
    
    const currentTableData = useMemo(() => {
        const firstPageIndex = (currentPage - 1) * PageSize;
        const lastPageIndex = firstPageIndex + PageSize;
        return usuarios.slice(firstPageIndex, lastPageIndex);
    }, [currentPage, usuarios]);

    const { isLoaded } = useJsApiLoader({
        googleMapsApiKey: "AIzaSyAQYGeShstIRAbsrS4lwyumbLwlG5t-sTA",
        libraries: ["places"],
      });
    
    
      if (!isLoaded) {
        return <SkeletonText />;
      }

    return (
        <>
            <Sidebar />
            <Topbar />
            <Flex h="30vh" className="margem-esq">
          <Box h="100%" w="100%">
            <GoogleMap
              center={x.path[0]}
              zoom={16}
              mapContainerStyle={{ width: "100%", height: "100%" }}
            >
                    <Polygon
                      options={{ strokeColor: "#027373", strokeWeight: 5 }}
                      onClick={()=>{console.log(location)}}
                      paths={x.path}
                    ></Polygon>
                  
            </GoogleMap>
          </Box>
        </Flex>

        <button className='btnVoltar margem-relatorio' onClick={() => navigate(-1)}> <img src="/img/btnVoltar.svg" alt="" /> Voltar</button>
        
            <div className="card margem-relatorio">
                
                <div className="card-body">

                    <div class="row">
                        <div class="col-md-12">
                            <h2>
                                Endereço: {location.state.vaga.rua_avenida} - {location.state.vaga.Bairro}
                            </h2>
                            <h2>
                                Regra: 
                            </h2>

                            <h3 className="py-3 text-center font-bold font-up blue-text">
                                Relatorio de Usuarios
                            </h3>
                        
                            <div class="input-group md-form form-sm form-2 pl-0">
                                <input class="form-control my-0 py-1 pl-3 purple-border" type="text" placeholder="Pesquise o usuario aqui..." aria-label="Search"/>
                                <span class="input-group-addon waves-effect purple lighten-2" id="basic-addon1"><a><i class="fa fa-search white-text" aria-hidden="true"></i></a></span>
                            </div>

                        </div>  
                    </div>
                    <table class="table table-hover table-responsive mb-0">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Nome</th>
                                <th>Tempo de Uso</th>
                                <th>Veiculo</th>
                                <th>Acessibilidade</th>
                            </tr>
                        </thead>
                        <tbody>
                            {currentTableData.map((item) => {
                                return (
                                    <tr>
                                        <td>{item.id}</td>
                                        <td>
                                            <Link to={{ pathname: `/menulogado/dadoUsuario/${item.id}` }}
                                            state={{usuario: item}}>
                                                {item.nome}
                                            </Link>
                                        </td>
                                        <td>{item.tempo_uso}</td>
                                        <td>{item.veiculo[0].modelo.toUpperCase()} {item.veiculo[0].placa}</td>
                                        <td>{item.acessibilidade ? "Sim" : "Não"}</td>
                                    </tr>
                                )
                            })}
                        </tbody>
                    </table>
                    <Pagination
                        currentPage={currentPage}
                        totalCount={usuarios.length}
                        pageSize={PageSize}
                        onPageChange={page => setCurrentPage(page)}
                    />
                </div>
            </div>
        </>
    )
}