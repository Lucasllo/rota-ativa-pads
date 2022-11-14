import "./editar_vaga/adicionar_remover.css";
import { Link } from 'react-router-dom';
/* import Topbar from "../home/Componentes/topbar/Topbar";
import Sidebar from "../home/Componentes/sidebar/Sidebar"; */

export function EditarVaga() {
    return (
        <>
            {/* <Sidebar />
                <Topbar /> */}
            <h1 className="tituloPag">Cadastro de Vaga</h1>
            <div class="adicionar">
                <div className="alternar">
                    <Link to="/editarvaga">
                        <button className="alternar_cadastrar">Cadastrar</button>
                    </Link>
                    <Link to="/removervaga">
                        <button className="alternar_remover">Remover</button>
                    </Link>
                </div>
                <form className='adicionar_form'>
                    <label className="adicionar_titulo">Vaga</label> {/* Cadastro de Vaga */}
                    <fieldset className="adicionar_corpo">
                        <input className="longitude" name="longitude inicial" type="text" required placeholder="Longitude inicial" />
                        <input className="longitude" name="longitude final" type="text" required placeholder="Longitude final" />
                    </fieldset>
                    <fieldset className="adicionar_corpo">
                        <input className="latitude" name="latitude inicial" type="text" required placeholder="Latitude inicial" />
                        <input className="latitude" name="longitude final" type="text" required placeholder="Latitude final" />
                    </fieldset>
                    <fieldset className="adicionar_corpo">
                        <input className="nomedavaga" name="nome da vaga" type="text" required placeholder="Nome da vaga" />
                    </fieldset>
                    <fieldset className="adicionar_corpo">
                        <label className="adicionar_titulo">
                            Regras
                        </label>
                    </fieldset>
                    <fieldset className="adicionar_corpo">
                        <select className="tipodevaga" name="tipodevaga" required>
                            <option value="selecione">Tipo de vaga</option>
                            <option value="comum">Comum</option>
                            <option value="prioritario">Prioritário</option>
                        </select>
                    </fieldset>
                    <fieldset className="adicionar_corpo">
                        <input className="horadeuso" name="hora de uso" type="text" required placeholder="Horário de uso" />
                        <select className="tempomaximo" name="tempomaximo" required>
                            <option value="tempo">Tempo máximo</option>
                            <option value="tempo">1 Hora</option>
                            <option value="tempo">2 Horas</option>
                            <option value="tempo">5 Horas</option>
                        </select>
                    </fieldset>
                    <button class="botao_enviar">Cadastrar</button>
                </form>
            </div>
        </>
    );
}

export default EditarVaga;