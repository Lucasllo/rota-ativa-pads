import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import { useLocation, useNavigate } from 'react-router-dom';
import './dadoUsuario.css'


export function DadoUsuario() {
    const location = useLocation();
    const navigate = useNavigate();

    const infos = ["Nome", "E-mail", "CPF", "Data de Nascimento"]
    const dados = [location.state.usuario.nome, location.state.usuario.email, location.state.usuario.cpf, location.state.usuario.datanasc]

    return (
        <>
            <div className="margem-esq">
                <div class="containerUser space">
                    <div class="flex w-full items-center">
                        <div class="flex items-center text-3xl">
                            {location.state.usuario.nome}
                        </div>
                        <div class="ml-auto sm:flex hidden items-center justify-end"></div>
                    </div>
                    <div class="flex items-center space-x-3 sm:mt-7 mt-4">

                    </div>
                </div>

                <div class="p-4">

                    {infos.map((info, index)=>{
                        return(
                            <div class="containerInfos formulario containerEffect bordaInferiorCor">
                                <div class="content p-3 bordaSuperior dados">
                                    <p class="mb-0 ">{info}</p>
                                    <span class="">{dados[index]}</span>
                                </div>
                            </div>        
                        )
                    })}

                   

                    <div class="containerInfos space2">
                        <div class="content rounded-3 p-3">
                            <h1 class="tituloVeiculos">Veículos</h1>
                        </div>
                    </div>

                    <section class="statistics space3">
                        <div class="row">
                            {
                                location.state.usuario.veiculo.map((item) => {
                                    return (
                                        <div class="col-lg-4 formulario">
                                            <div class="box d-flex rounded-2 align-items-center p-3">

                                                <div class="ms-3 space3">
                                                    <div class="d-flex align-items-center">
                                                        <h5 class="mb-0">{item.modelo.toUpperCase()}</h5>
                                                        <span class="d-block ms-2">{item.placa}</span>
                                                    </div>
                                                    <p class="fs-normal mb-0">{item.cor.toUpperCase()}</p>
                                                </div>

                                            </div>
                                        </div>
                                    )
                                })
                            }


                        </div>
                    </section>

                </div>
            </div>
            <div className="p-4-left">
                <button className='btnVoltar margem-relatorio' onClick={() => navigate(-1)}> <img src="/img/btnVoltar.svg" alt="voltar" /> Voltar</button>

            </div>
        </>
    )
}