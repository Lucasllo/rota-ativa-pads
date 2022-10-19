import { Box, Flex, SkeletonText } from "@chakra-ui/react";
import {
  useJsApiLoader,
  GoogleMap,
  Polygon,
  Marker,
} from "@react-google-maps/api";
import { useEffect, useState } from "react";
import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import dados from "./json.json";
import VagaService from "../../service/vaga";
import './map.css'

const center = { lat: -3.735015, lng: -38.494695 };

export function Map() {
  const vagaService = new VagaService();

  const [vagas, setVagas] = useState([])

  useEffect(() => {
      vagaService.getVaga().then((resp) => setVagas(resp.data));
  }, [])


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
      <div className="margin-left">
        <Flex h="50vh">
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
                      options={{ strokeColor: x ? "#FF5858" : "#027373", strokeWeight: 2 }}
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
      </div>
    </>
  );
}
