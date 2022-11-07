import Sidebar from "./Componentes/sidebar/Sidebar";
import Topbar from "./Componentes/topbar/Topbar";
import { Outlet } from "react-router-dom";
{
  /* https://fisqmr.csb.app/login */
}
export function Home() {
  return (
    <>
      <Sidebar />
      <Topbar />

      <Outlet />
      
    </>
  );
}

export default Home;
