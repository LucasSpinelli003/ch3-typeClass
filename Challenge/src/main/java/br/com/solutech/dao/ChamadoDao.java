package br.com.solutech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.solutech.model.Chamado;
import br.com.solutech.model.Segurado;

public class ChamadoDao {

	private Connection conn;
	
	public ChamadoDao() {}
	
	public ChamadoDao(Connection conn) {
		this.conn = conn;
	}
	
	public List<Chamado> listar() throws ClassNotFoundException, SQLException {

		PreparedStatement stm_segurado = conn.prepareStatement("select * from t_sip_segurado");
		PreparedStatement stm_chamado = conn.prepareStatement("Select * from t_sip_chamado");
		PreparedStatement stm_endereco_chamado = conn.prepareStatement("Select * from t_sip_endereco_chamado");
		PreparedStatement stm_endereco_segurado = conn.prepareStatement("Select * from t_sip_endereco_segurado");
		PreparedStatement stm_contato_segurado = conn.prepareStatement("Select * from t_sip_contato_segurado");
		PreparedStatement stm_info_veiculo = conn.prepareStatement("Select * from t_sip_info_veiculo");
		
		
		ResultSet result_segurado = stm_segurado.executeQuery();
		ResultSet result_chamado = stm_chamado.executeQuery();
		ResultSet result_endereco_chamado = stm_endereco_chamado.executeQuery();
		ResultSet result_endereco_segurado = stm_endereco_segurado.executeQuery();
		ResultSet result_contato_segurado = stm_contato_segurado.executeQuery();
		ResultSet result_info_veiculo = stm_info_veiculo.executeQuery();
		
		List<Chamado> lista = new ArrayList<Chamado>();

		while (result_segurado.next() && result_chamado.next() && result_endereco_chamado.next() && result_endereco_segurado.next() && result_contato_segurado.next()&& result_info_veiculo.next()) {
			int idSegurado = result_segurado.getInt("id_segurado");
			String nomeSegurado = result_segurado.getString("nome_completo");
			Object nascimentoSegurado = result_segurado.getObject("data_nascimento");
			String rg = result_segurado.getString("rg");
			String cpf = result_segurado.getString("cpf");
			
			int idChamado = result_chamado.getInt("id_chamado");
			String descricaoChamado = result_chamado.getString("descricao");
			Object dataChamado = result_chamado.getObject("data_chamado");
			
			String logradouroChamado = result_endereco_chamado.getString("largadouro");
			int numeroEnderecoChamado = result_endereco_chamado.getInt("numero");
			String pontoReferencia = result_endereco_chamado.getString("ponto_referencia");
			
			String cepSegurado = result_endereco_segurado.getString("cep");
			String logradouroSegurado = result_endereco_segurado.getString("largadouro");
			String bairroSegurado = result_endereco_segurado.getString("bairro");
			String complementoSegurado = result_endereco_segurado.getString("complemento");
			
			String telefoneSegurado = result_contato_segurado.getString("telefone");
			String emailSegurado = result_contato_segurado.getString("email");
			
			String modeloVeiculo = result_info_veiculo.getString("modelo");
			double pesoVeiculo = result_info_veiculo.getDouble("peso");
			double alturaVeiculo = result_info_veiculo.getDouble("altura");
			double comprimentoVeiculo = result_info_veiculo.getDouble("largura");
			int eixosVeiculo = result_info_veiculo.getInt("qtd_eixos");
			String tipoCarroceria = result_info_veiculo.getString("tipo_carroceria");
			double pesoCargaVeiculo = result_info_veiculo.getDouble("peso_carga");
			String alteracaoVeiculo = result_info_veiculo.getString("alteracoes");
			
			
			Segurado prodSeg = new Segurado(idSegurado, nomeSegurado,nascimentoSegurado,rg,cpf,cepSegurado,logradouroSegurado,bairroSegurado,complementoSegurado,telefoneSegurado,emailSegurado);
			Chamado prod = new Chamado(idChamado,idSegurado,cepSegurado,logradouroSegurado,bairroSegurado,complementoSegurado,telefoneSegurado,emailSegurado,logradouroChamado,numeroEnderecoChamado,pontoReferencia,descricaoChamado, dataChamado);
			
			
			
			
			lista.add(prod);
		}
		return lista;
	}

}
