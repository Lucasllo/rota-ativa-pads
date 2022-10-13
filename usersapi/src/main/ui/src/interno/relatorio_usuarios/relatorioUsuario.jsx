import { useEffect, useLayoutEffect, useMemo, useState } from 'react';
import Pagination from '../../components/Paginacao/Pagination';
import VagaService from '../../service/vaga';
import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import './relatorioUsuario.css'

let PageSize = 5;

export function RelatorioUsuario() {
    const vagaService = new VagaService();

    const [usuarios, setUsuarios] = useState([])
    const [currentPage, setCurrentPage] = useState(1);

    useEffect(() => {
        vagaService.getVaga().then((resp) => setUsuarios(resp.data));
    }, [])    
    
    useLayoutEffect(()=>{
    })
    
    const currentTableData = useMemo(() => {
        const firstPageIndex = (currentPage - 1) * PageSize;
        const lastPageIndex = firstPageIndex + PageSize;
        return usuarios.slice(firstPageIndex, lastPageIndex);
    }, [currentPage, usuarios]);

    return (
        <>
            <Sidebar />
            <Topbar />
            <div className="margem">
                <h1>
                    Relatorio de Usuarios
                </h1>
                <table class="content-table">
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Creditos</th>
                            <th>Tempo de uso</th>
                            <th>Veiculo</th>
                        </tr>
                    </thead>
                    <tbody>
                        {currentTableData.map((item) => {
                            return (
                                <tr>
                                    <td>{item.nome}</td>
                                    <td>{item.credito}</td>
                                    <td>{item.tempo_uso}</td>
                                    <td>{item.veiculo[0].modelo} {item.veiculo[0].placa}</td>
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
        </>
    )
}