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
      <div className="margem-esq">
        <Flex className="mapa">
          <Box h="100%" w="100%">
            <GoogleMap
              center={center}
              zoom={15}
              mapContainerStyle={{ width: "100%", height: "100%" }}
            >
              {dados.map((d) => {
                return (
                  <>
                    <Polygon
                      options={{ strokeColor: "#027373", strokeWeight: 2 }}
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
