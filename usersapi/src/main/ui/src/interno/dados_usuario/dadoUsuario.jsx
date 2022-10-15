import { useEffect, useLayoutEffect, useMemo, useState } from 'react';
import VagaService from '../../service/vaga';
import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import './dadoUsuario.css'
import { useLocation } from 'react-router-dom';


export function DadoUsuario() {
    const location = useLocation();
    const vagaService = new VagaService();

    const [usuario, setUsuario] = useState({})

    useEffect(() => {
        setUsuario(location.state.usuario)
        console.log(location.state.usuario)
    }, [])
    useLayoutEffect(() => {
        setUsuario(location.state.usuario)
    })

    return (
        <>
            <Sidebar />
            <Topbar />
            <div className='margem-dados'>
                <div class="containerUser space">
                    <div class="flex w-full items-center">
                        <div class="flex items-center text-3xl text-gray-900 dark:text-white">
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
                            <p class="mb-0 ">nome</p>
                            <span class="d-block ms-2 bordaCompleta paddingLeft">{location.state.usuario.nome}</span>
                        </div>
                    </div>

                    <div class="containerInfos formulario containerEffect bordaInferiorCor">
                        <div class="content p-3">
                            <p class="mb-0">e-mail</p>
                            <span class="d-block ms-2 bordaCompleta paddingLeft">`{location.state.usuario.email}`</span>
                        </div>
                    </div>

                    <div class="containerInfos formulario containerEffect bordaInferiorCor">
                        <div class="content p-3">
                            <p class="mb-0">telefone</p>
                            <span class="d-block ms-2 bordaCompleta paddingLeft">(00) 00000-0000</span>
                        </div>
                    </div>

                    <div class="containerInfos formulario containerEffect ">
                        <div class="content p-3 bordaInferior">
                            <p class="mb-0">endereço</p>
                            <span class="d-block ms-2 bordaCompleta paddingLeft">Av.Washington Soares, 1321</span>
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

                                                {/* <img src="./mustang.jpg" class="w-12 mr-4 rounded-full" alt="profile" /> */}
                                                <div class="ms-3 space3">
                                                    <div class="d-flex align-items-center">
                                                        <h5 class="mb-0">{item.modelo}</h5>
                                                        <span class="d-block ms-2">{item.placa}</span>
                                                    </div>
                                                    <p class="fs-normal mb-0">{item.cor}</p>
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