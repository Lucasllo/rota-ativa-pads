import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import { useLocation } from 'react-router-dom';
import './dadoUsuario.css'


export function DadoUsuario() {
    const location = useLocation();

    return (
        <>
            <Sidebar />
            <Topbar />
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

                    <div class="containerInfos formulario containerEffect bordaInferiorCor">
                        <div class="content p-3 bordaSuperior ">
                            <p class="mb-0 ">Nome</p>
                            <span class="d-block ms-2 bordaCompleta paddingLeft">{location.state.usuario.nome}</span>
                        </div>
                    </div>

                    <div class="containerInfos formulario containerEffect bordaInferiorCor">
                        <div class="content p-3">
                            <p class="mb-0">E-mail</p>
                            <span class="d-block ms-2 bordaCompleta paddingLeft">{location.state.usuario.email}</span>
                        </div>
                    </div>

                    <div class="containerInfos formulario containerEffect bordaInferiorCor">
                        <div class="content p-3">
                            <p class="mb-0">CPF</p>
                            <span class="d-block ms-2 bordaCompleta paddingLeft">{location.state.usuario.cpf}</span>
                        </div>
                    </div>

                    <div class="containerInfos formulario containerEffect ">
                        <div class="content p-3 bordaInferior">
                            <p class="mb-0">Data de Nascimento</p>
                            <span class="d-block ms-2 bordaCompleta paddingLeft">{location.state.usuario.datanasc}</span>
                        </div>
                    </div>

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
        </>
    )
}