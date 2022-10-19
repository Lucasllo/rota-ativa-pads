import { useEffect, useMemo, useState } from 'react';
import Pagination from '../../components/Paginacao/Pagination';
import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar";
import './relatorioVaga.css'
import VagaService from '../../service/vaga';
import { Link, useNavigate } from 'react-router-dom';

let PageSize = 10;

export function RelatorioVagas() {
    const vagaService = new VagaService();
    const navigate = useNavigate();

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
            <button className='btnVoltar margem-relatorio' onClick={() => navigate(-1)}> <img src="/img/btnVoltar.svg" alt="" /> Voltar</button>
            <div className="card margem-relatorio">
                <div className="card-body">
                    <h1 className="py-3 text-center font-bold font-up blue-text">
                        Relatorio de Vagas
                    </h1>
                    <table class="table table-hover table-responsive mb-0">
                        <thead>
                            <tr>
                                <th scope="row">#</th>
                                <th class="th-lg">Nome</th>
                                <th class="th-lg">Crédito</th>
                                <th class="th-lg">Total do veículos</th>
                                <th class="th-lg">Tempo de uso</th>
                            </tr>
                        </thead>
                        <tbody>
                            {currentTableData.map((item) => {
                                var tempo = 0;
                                var credito = 0;
                                var veiculos = 0;
                                item.usuarios.forEach(element => {
                                    tempo += element.tempo_uso
                                    credito += element.credito
                                    veiculos += element.veiculo.length
                                })
                                return (
                                    <tr>
                                        <td>{item.id}</td>
                                        <td>
                                            <Link to={{ pathname: `/menulogado/relatorioUsuarios/${item.id}` }}
                                                state={{ vaga: item }}>
                                                {item.rua_avenida} - {item.Bairro}
                                            </Link>
                                        </td>
                                        <td>{credito}</td>
                                        <td>{veiculos}</td>
                                        <td>{tempo} h</td>
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
            </div>
        </>
    )
}