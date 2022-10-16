import { useEffect, useLayoutEffect, useMemo, useState } from 'react';
import Pagination from '../../components/Paginacao/Pagination';
import VagaService from '../../service/vaga';
import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import './relatorioUsuario.css'
import { Link, useLocation } from 'react-router-dom';

let PageSize = 5;

export function RelatorioUsuario() {
    const location = useLocation();

    const [usuarios, setUsuarios] = useState([])
    const [currentPage, setCurrentPage] = useState(1);

    useEffect(() => {
            setUsuarios(location.state.vaga.usuarios)
    }, [])

    const currentTableData = useMemo(() => {
        const firstPageIndex = (currentPage - 1) * PageSize;
        const lastPageIndex = firstPageIndex + PageSize;
        return usuarios.slice(firstPageIndex, lastPageIndex);
    }, [currentPage, usuarios]);

    return (
        <>
            <Sidebar />
            <Topbar />
            <div className="card margem">
                <div className="card-body">

                    <div class="row">
                        <div class="col-md-12">
                            <h1 className="py-3 text-center font-bold font-up blue-text">
                                Relatorio de Usuarios
                            </h1>
                        
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