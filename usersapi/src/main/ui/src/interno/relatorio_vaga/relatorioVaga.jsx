import { useEffect, useMemo, useState } from 'react';
import Pagination from '../../components/Paginacao/Pagination';
import UserService from '../../service/users';
import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import './relatorioVaga.css'

let PageSize = 5;

export function RelatorioVagas() {
    const userService = new UserService();

    const [vagas, setVagas] = useState([])
    const [currentPage, setCurrentPage] = useState(1);

    useEffect(() => {
        userService.getUsuario().then((resp) => setVagas(resp.data));
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
                            <th>Quantidade de veiculos</th>
                            <th>Tempo</th>
                        </tr>
                    </thead>
                    <tbody>
                        {currentTableData.map((item) => {
                            return (
                                <tr>
                                    <td>{item.nome}</td>
                                    <td>{item.cpf}</td>
                                    <td>{item.email}</td>
                                    <td>{item.ticket}</td>
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