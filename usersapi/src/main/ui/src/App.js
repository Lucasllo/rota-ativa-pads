import "./reset.css";
import "./base.css";
import { Cabecalho } from "./externo/cabecalho/cabecalho";
import { Route, Routes, useLocation } from "react-router-dom";
import { Index } from "./externo/index/index";
import { Rodape } from "./externo/rodape/rodape";
import { Cadastro } from "./externo/cadastro/cadastro";
import { Login } from "./externo/login/login";

function App() {

  return (
    <>
      <Cabecalho />
      <Routes>
        <Route element={<Index />} exact path="/"></Route>
        <Route element={<Cadastro />} exact path="/cadastro"></Route>
        <Route element={<Login />} exact path="/login"></Route>
      </Routes>
      { useLocation().pathname == "/" 
      ? 
      <Rodape />
      :
      ""
      }
    </>
  );
}

export default App;
