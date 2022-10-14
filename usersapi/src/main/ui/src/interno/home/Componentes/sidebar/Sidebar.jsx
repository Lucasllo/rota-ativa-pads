import { Link } from "react-router-dom";
import "./Sidebar.css";

export function navbarLateral() {
  return (
    <aside
      className="sidebar position-fixed top-0 left-0 overflow-auto h-100 float-left"
      id="show-side-navigation1"
    >
      <i
        className="uil-bars close-aside d-md-none d-lg-none"
        data-close="show-side-navigation1"
      ></i>
      {/* NAVBAR LATERAL - IMAGEM DE USER + TIPO DE USER */}
      <div className="sidebar-header d-flex justify-content-center align-items-center px-3 py-4">
        <img
          className="rounded-pill img-fluid"
          width="65"
          src="https://uniim1.shutterfly.com/ng/services/mediarender/THISLIFE/021036514417/media/23148907008/medium/1501685726/enhance"
          alt="Imagem do usuário"
        />
        <div className="ms-2">
          <h5 className="fs-6 mb-0">
            <a className="text-decoration-none" href="/#">
              Matheus Dias
            </a>
          </h5>
          <p className="mt-1 mb-0">Admin</p>
        </div>
      </div>
      {/* NAVBAR LATERAL - BUSCADOR */}
      <div className="search position-relative text-center px-4 py-3 mt-2">
        <input
          type="text"
          className="form-control w-100 border-0 bg-transparent"
          placeholder="Buscar"
        />
        <i className="fa fa-search position-absolute d-block fs-6"></i>
      </div>
      {/* NAVBAR LATERAL - LINKS DE ACESSO */}
      <ul className="categories list-unstyled">
        <li className="">
          <i className="uil-estate fa-fw"></i>
          <Link to="/menulogado/1">Dashboard</Link>
        </li>
        <li>
          <i className="uil-map-marker"></i>
          <Link to="/menulogado/relatorioVagas">Relatorio de Vagas</Link>
        </li>
        <li className="">
          <i className="uil-map-marker"></i>
          <Link to="/menulogado/mapa">Mapa</Link>
        </li>
        <li className="">
          <i className="uil-setting"></i>
          <a href="/#"> Configurações</a>
        </li>
      </ul>
    </aside>
  );
}

export default navbarLateral;
