import { useEffect, useMemo, useState } from 'react';
import Pagination from '../../components/Paginacao/Pagination';
import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import './relatorioVaga.css'
import VagaService from '../../service/vaga';
import { Link } from 'react-router-dom';

let PageSize = 5;

export function RelatorioVagas() {
    const vagaService = new VagaService();

    const [vagas, setVagas] = useState([])
    const [currentPage, setCurrentPage] = useState(1);

    useEffect(() => {
        vagaService.getVaga().then((resp) => setVagas(resp.data));
    }, [])

    const currentTableData = useMemo(() => {
        const firstPageIndex = (currentPage - 1) * PageSize;
        const lastPageIndex = firstPageIndex + PageSize;
        return vagas.slice(firstPageIndex, lastPageIndex);
    }, [currentPage, vagas]);


    return (
        <>
            <Sidebar />
            <Topbar />
            <div className="margem">
                <h1>
                    Relatorio de Vagas
                </h1>
                <table class="content-table">
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Endereço</th>
                            <th>Quantidade de Usuarios</th>
                            <th>Tempo</th>
                        </tr>
                    </thead>
                    <tbody>
                        {currentTableData.map((item) => {
                            var tempo = 0;
                            item.usuarios.forEach(element => {
                                tempo += element.tempo_uso
                            })
                            return (
                                <tr>
                                    <td>{item.id}</td>
                                    <Link to={{ pathname: `/menulogado/relatorioUsuarios/${item.id}` }}
                                    state={{id: item.id}}>
                                        <td>
                                            {item.rua_avenida} - {item.Bairro}
                                        </td>
                                    </Link>
                                    <td>{item.usuarios.length}</td>
                                    <td>{tempo}</td>
                                </tr>
                            )
                        })}
                    </tbody>
                </table>
                <Pagination
                    currentPage={currentPage}
                    totalCount={vagas.length}
                    pageSize={PageSize}
                    onPageChange={page => setCurrentPage(page)}
                />
            </div>
        </>
    )
}