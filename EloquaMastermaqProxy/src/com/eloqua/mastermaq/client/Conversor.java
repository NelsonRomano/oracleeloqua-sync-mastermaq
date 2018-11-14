package com.eloqua.mastermaq.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.eloqua.mastermaq.entity.ContaEloqua;
import com.eloqua.mastermaq.entity.ContatoEloqua;
import com.eloqua.mastermaq.entity.FieldValue;
import com.eloqua.mastermaq.entity.PropriedadesConta;
import com.eloqua.mastermaq.entity.PropriedadesContato;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mastermaq.integracrm.ContaEL;
import com.mastermaq.integracrm.ContatoEL;

public class Conversor {

    public static ContatoEloqua converterContatoELParaContatoEloqua(ContatoEL cm,
            ParametrosConexaoEloqua parametrosConexaoEloqua) throws UnsupportedEncodingException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String value = "";
        ContatoEloqua contatoEloqua = new ContatoEloqua();
        ContatoEL contatoEL = cm;
        List<FieldValue> lfv = new ArrayList<FieldValue>();

        if (contatoEL.getAfinidade() != null) {
            FieldValue fv2 = new FieldValue();
            fv2.setId("100214");
            value = new String(contatoEL.getAfinidade().getBytes("UTF-8"));
            fv2.setValue(value);
            lfv.add(fv2);
        }

        if (contatoEL.getApelido() != null) {
            FieldValue fv8 = new FieldValue();
            fv8.setId("100222");
            value = new String(contatoEL.getApelido().getBytes("UTF-8"));
            fv8.setValue(value);
            lfv.add(fv8);
        }

        if (contatoEL.getBusinessPhone() != null) {
            contatoEloqua.setBusinessPhone(new String(contatoEL.getBusinessPhone().getBytes("UTF-8")));
        }

        if (contatoEL.getCadastroNaUniversidade() != null) {
            FieldValue fv21 = new FieldValue();
            fv21.setId("100204");
            value = new String(contatoEL.getCadastroNaUniversidade().getBytes("UTF-8"));
            fv21.setValue(value);
            lfv.add(fv21);
        }

        if (contatoEL.getCelular() != null) {
            contatoEloqua.setMobilePhone(new String(contatoEL.getCelular().getBytes("UTF-8")));
        }

        if (contatoEL.getCodigoSiEmpresa() == 0) {
            FieldValue fv20 = new FieldValue();
            fv20.setId("100267");
            value = new String(Integer.toString(contatoEL.getCodigoSiEmpresa()).getBytes("UTF-8"));
            fv20.setValue(value);
            lfv.add(fv20);
        }

        if (contatoEL.getContatoPreferencial() != null) {
            FieldValue fv19 = new FieldValue();
            fv19.setId("100216");
            value = new String(contatoEL.getContatoPreferencial().getBytes("UTF-8"));
            fv19.setValue(value);
            lfv.add(fv19);
        }

        if (contatoEL.getCursoFormacaoSuperiorTecnica() != null) {
            FieldValue fv14 = new FieldValue();
            fv14.setId("100208");
            value = new String(contatoEL.getCursoFormacaoSuperiorTecnica().getBytes("UTF-8"));
            fv14.setValue(value);
            lfv.add(fv14);
        }

        if (contatoEL.getDataUltAtualizacao() != null) {
            FieldValue fv22 = new FieldValue();
            fv22.setId("100260");
            fv22.setValue(sdf.format(XMLGregorianCalendarToDate(contatoEL.getDataUltAtualizacao())));
            lfv.add(fv22);
        }

        if (contatoEL.getDecisaoParaCompra() != null) {
            FieldValue fv3 = new FieldValue();
            fv3.setId("100215");
            value = new String(contatoEL.getDecisaoParaCompra().getBytes("UTF-8"));
            fv3.setValue(value);
            lfv.add(fv3);
        }

        if (contatoEL.getDetalhamentoHobby() != null) {
            FieldValue fv9 = new FieldValue();
            fv9.setId("100196");
            value = new String(contatoEL.getDetalhamentoHobby().getBytes("UTF-8"));
            fv9.setValue(value);
            lfv.add(fv9);
        }

        if (contatoEL.getEmailAddress() != null) {
            contatoEloqua.setEmailAddress(new String(contatoEL.getEmailAddress().getBytes("UTF-8")));
        }

        if (contatoEL.getEscolaridade() != null) {
            FieldValue fv4 = new FieldValue();
            fv4.setId("100218");
            value = new String(contatoEL.getEscolaridade().getBytes("UTF-8"));
            fv4.setValue(value);
            lfv.add(fv4);
        }

        if (contatoEL.getEstadoCivil() != null) {
            FieldValue fv6 = new FieldValue();
            fv6.setId("100220");
            value = new String(contatoEL.getEstadoCivil().getBytes("UTF-8"));
            fv6.setValue(value);
            lfv.add(fv6);
        }

        if (contatoEL.getFaixaSalarial() != null) {
            FieldValue fv10 = new FieldValue();
            fv10.setId("100197");
            value = new String(contatoEL.getFaixaSalarial().toString().getBytes("UTF-8"));
            fv10.setValue(value);
            lfv.add(fv10);
        }

        if (contatoEL.getFirstName() != null) {
            contatoEloqua.setFirstName(new String(contatoEL.getFirstName().getBytes("UTF-8")));
        }

        if (contatoEL.getFuncao() != null) {
            FieldValue fv23 = new FieldValue();
            fv23.setId("100259");
            value = new String(contatoEL.getFuncao().getBytes("UTF-8"));
            fv23.setValue(value);
            lfv.add(fv23);
        }

        if (contatoEL.getHobby() != null) {
            FieldValue fv18 = new FieldValue();
            fv18.setId("100223");
            value = new String(contatoEL.getHobby().getBytes("UTF-8"));
            fv18.setValue(value);
            lfv.add(fv18);
        }

        if (contatoEL.getInstituicaoFormacaoSuperiorTecnica() != null) {
            FieldValue fv15 = new FieldValue();
            fv15.setId("100209");
            value = new String(contatoEL.getInstituicaoFormacaoSuperiorTecnica().getBytes("UTF-8"));
            fv15.setValue(value);
            lfv.add(fv15);
        }

        if (contatoEL.getLastName() != null) {
            contatoEloqua.setLastName(new String(contatoEL.getLastName().getBytes("UTF-8")));
        }

        if (contatoEL.getDiaNascimento() != 0 || contatoEL.getMesNascimento() != 0
                || contatoEL.getAnoNascimento() != 0) {
            FieldValue fv24 = new FieldValue();
            fv24.setId("100217");
            String dataCorrigida = contatoEL.getMesNascimento() + "/" + contatoEL.getDiaNascimento() + "/"
                    + contatoEL.getAnoNascimento();
            fv24.setValue(dataCorrigida);
            lfv.add(fv24);
        }

        else {
            FieldValue fv24 = new FieldValue();
            fv24.setId("100217");
            lfv.add(fv24);
        }

        if (contatoEL.getNaturezaOcupacao() != null) {
            FieldValue fv7 = new FieldValue();
            fv7.setId("100221");
            value = new String(contatoEL.getNaturezaOcupacao().getBytes("UTF-8"));
            fv7.setValue(value);
            lfv.add(fv7);
        }

        if (contatoEL.getNivelHierarquico() != null) {
            FieldValue fv1 = new FieldValue();
            fv1.setId("100213");
            value = new String(contatoEL.getNivelHierarquico().getBytes("UTF-8"));
            fv1.setValue(value);
            lfv.add(fv1);
        }

        if (contatoEL.getNivelInfluencia() != null) {
            FieldValue fv17 = new FieldValue();
            fv17.setId("100224");
            value = new String(contatoEL.getNivelInfluencia().getBytes("UTF-8"));
            fv17.setValue(value);
            lfv.add(fv17);
        }

        if (contatoEL.getSalesperson() != null) {
            contatoEloqua.setSalesPerson(new String(contatoEL.getSalesperson().getBytes("UTF-8")));
        }

        if (contatoEL.getSexo() != null) {
            FieldValue fv5 = new FieldValue();
            fv5.setId("100219");
            value = new String(contatoEL.getSexo().getBytes("UTF-8"));
            fv5.setValue(value);
            lfv.add(fv5);
        }

        if (contatoEL.getSiteBlog() != null) {
            FieldValue fv16 = new FieldValue();
            fv16.setId("100210");
            value = new String(contatoEL.getSiteBlog().getBytes("UTF-8"));
            fv16.setValue(value);
            lfv.add(fv16);
        }

        if (contatoEL.getTamanhoCamiseta() != null) {
            FieldValue fv11 = new FieldValue();
            fv11.setId("100205");
            value = new String(contatoEL.getTamanhoCamiseta().getBytes("UTF-8"));
            fv11.setValue(value);
            lfv.add(fv11);
        }

        if (contatoEL.getTimeFutebol() != null) {
            FieldValue fv12 = new FieldValue();
            fv12.setId("100206");
            value = new String(contatoEL.getTimeFutebol().getBytes("UTF-8"));
            fv12.setValue(value);
            lfv.add(fv12);
        }

        if (contatoEL.getTipoMusicaFavorita() != null) {
            FieldValue fv13 = new FieldValue();
            fv13.setId("100207");
            value = new String(contatoEL.getTipoMusicaFavorita().getBytes("UTF-8"));
            fv13.setValue(value);
            lfv.add(fv13);
        }

        if (contatoEL.getTitle() != null) {
            contatoEloqua.setTitle(new String(contatoEL.getTitle().getBytes("UTF-8")));
        }

        contatoEloqua.setFieldValues(lfv);
        return contatoEloqua;
    }

    public static ContaEloqua converterContaELParaContaEloqua(ContaEL c, ParametrosConexaoEloqua parametrosConexaoEloqua)
            throws IOException, URISyntaxException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String value = "";
        ContaEloqua contaEloqua = new ContaEloqua();
        ContaEL contaEL = c;
        List<FieldValue> lfv = new ArrayList<FieldValue>();

        if (contaEL.getCompany() != null) {
            contaEloqua.setName((new String(contaEL.getCompany().getBytes("UTF-8"))));
        }

        if (contaEL.getAddress1() != null) {
            contaEloqua.setAddress1(new String(contaEL.getAddress1().getBytes("UTF-8")));
        }

        if (contaEL.getAmplitudeGeográfica() != null) {
            FieldValue fv25 = new FieldValue();
            fv25.setId("100298");
            value = new String(contaEL.getAmplitudeGeográfica().getBytes("UTF-8"));
            fv25.setValue(value);
            lfv.add(fv25);
        }

        if (contaEL.getAreaAtuacao() != null) {
            FieldValue fv26 = new FieldValue();
            fv26.setId("100299");
            value = new String(contaEL.getAreaAtuacao().getBytes("UTF-8"));
            fv26.setValue(value);
            lfv.add(fv26);
        }

        if (contaEL.getCep() != null) {
            contaEloqua.setPostalCode(new String(contaEL.getCep().getBytes("UTF-8")));
        }

        if (contaEL.getChamadoCancelamentoEmAberto() != null) {
            FieldValue fv27 = new FieldValue();
            fv27.setId("100282");
            value = new String(contaEL.getChamadoCancelamentoEmAberto().getBytes("UTF-8"));
            fv27.setValue(value);
            lfv.add(fv27);
        }

        if (contaEL.getChamadoCancelamentoUltSeisMeses() != null) {
            FieldValue fv28 = new FieldValue();
            fv28.setId("100283");
            value = new String(contaEL.getChamadoCancelamentoUltSeisMeses().getBytes("UTF-8"));
            fv28.setValue(value);
            lfv.add(fv28);
        }

        if (contaEL.getChamadoReclamacaoEmAberto() != null) {
            FieldValue fv29 = new FieldValue();
            fv29.setId("100284");
            value = new String(contaEL.getChamadoReclamacaoEmAberto().getBytes("UTF-8"));
            fv29.setValue(value);
            lfv.add(fv29);
        }

        if (contaEL.getCity() != null) {
            contaEloqua.setCity(new String(contaEL.getCity().getBytes("UTF-8")));
        }

        if (contaEL.getClasse() != null) {
            FieldValue fv37 = new FieldValue();
            fv37.setId("100278");
            value = new String(contaEL.getClasse().getBytes("UTF-8"));
            fv37.setValue(value);
            lfv.add(fv37);
        }

        if (contaEL.getClienteDesde() != null) {
            FieldValue fv31 = new FieldValue();
            fv31.setId("100281");
            fv31.setValue(sdf.format(XMLGregorianCalendarToDate(contaEL.getClienteDesde())));
            lfv.add(fv31);
        }

        if (contaEL.getCodigoSiEmpresa() != 0) {
            FieldValue fv32 = new FieldValue();
            fv32.setId("100275");
            value = new String(Integer.toString(contaEL.getCodigoSiEmpresa()).getBytes("UTF-8"));
            fv32.setValue(value);
            lfv.add(fv32);
        }

        if (contaEL.getComplemento() != null) {
            contaEloqua.setAddress2(new String(contaEL.getComplemento().getBytes("UTF-8")));
        }

        if (contaEL.getCpfCnpj() != null) {
            FieldValue fv33 = new FieldValue();
            fv33.setId("100279");
            value = new String(contaEL.getCpfCnpj().getBytes("UTF-8"));
            fv33.setValue(value);
            lfv.add(fv33);
        }

        if (contaEL.getDataUltAtualizacao() != null) {
            FieldValue fv34 = new FieldValue();
            fv34.setId("100300");
            fv34.setValue(sdf.format(XMLGregorianCalendarToDate(contaEL.getDataUltAtualizacao())));
            lfv.add(fv34);
        }

        if (contaEL.getDescricaoCnae() != null) {
            FieldValue fv35 = new FieldValue();
            fv35.setId("100301");
            value = new String(contaEL.getDescricaoCnae().getBytes("UTF-8"));
            fv35.setValue(value);
            lfv.add(fv35);
        }

        if (contaEL.getDosPuro() != null) {
            FieldValue fv36 = new FieldValue();
            fv36.setId("100286");
            value = new String(contaEL.getDosPuro().getBytes("UTF-8"));
            fv36.setValue(value);
            lfv.add(fv36);
        }

        if (contaEL.getEstado() != null) {
            contaEloqua.setProvince((new String(contaEL.getEstado().getBytes("UTF-8"))));
        }

        if (contaEL.getMotivoNPSUltimaCotacao() != null) {
            FieldValue fv38 = new FieldValue();
            fv38.setId("100302");
            value = new String(contaEL.getMotivoNPSUltimaCotacao().getBytes("UTF-8"));
            fv38.setValue(value);
            lfv.add(fv38);
        }

        if (contaEL.getMotivoNPSUltimaDemonstracao() != null) {
            FieldValue fv39 = new FieldValue();
            fv39.setId("100303");
            value = new String(contaEL.getMotivoNPSUltimaDemonstracao().getBytes("UTF-8"));
            fv39.setValue(value);
            lfv.add(fv39);
        }

        if (contaEL.getMotivoNpsUltimaVenda() != null) {
            FieldValue fv40 = new FieldValue();
            fv40.setId("100304");
            value = new String(contaEL.getMotivoNpsUltimaVenda().getBytes("UTF-8"));
            fv40.setValue(value);
            lfv.add(fv40);
        }

        if (contaEL.getNomeClasse() != null) {
            FieldValue fv41 = new FieldValue();
            fv41.setId("100277");
            value = new String(contaEL.getNomeClasse().getBytes("UTF-8"));
            fv41.setValue(value);
            lfv.add(fv41);
        }

        if (contaEL.getNPSUltimaCotacao() != null) {
            FieldValue fv42 = new FieldValue();
            fv42.setId("100305");
            value = new String(contaEL.getNPSUltimaCotacao().getBytes("UTF-8"));
            fv42.setValue(value);
            lfv.add(fv42);
        }

        if (contaEL.getNPSUltimaDemonstracao() != null) {
            FieldValue fv43 = new FieldValue();
            fv43.setId("100306");
            value = new String(contaEL.getNPSUltimaDemonstracao().getBytes("UTF-8"));
            fv43.setValue(value);
            lfv.add(fv43);
        }

        if (contaEL.getNpsUltimaVenda() != null) {
            FieldValue fv44 = new FieldValue();
            fv44.setId("100307");
            value = new String(contaEL.getNpsUltimaVenda().getBytes("UTF-8"));
            fv44.setValue(value);
            lfv.add(fv44);
        }

        if (contaEL.getPais() != null && contaEL.getPais().equals("Brasil")) {
            contaEloqua.setCountry("BR");
        }

        if (contaEL.getPerfil1Clientes() != null) {
            FieldValue fv45 = new FieldValue();
            fv45.setId("100308");
            value = new String(contaEL.getPerfil1Clientes().getBytes("UTF-8"));
            fv45.setValue(value);
            lfv.add(fv45);
        }

        if (contaEL.getPerfil2Clientes() != null) {
            FieldValue fv46 = new FieldValue();
            fv46.setId("100309");
            value = new String(contaEL.getPerfil2Clientes().getBytes("UTF-8"));
            fv46.setValue(value);
            lfv.add(fv46);
        }

        if (contaEL.getPerfil3Clientes() != null) {
            FieldValue fv47 = new FieldValue();
            fv47.setId("100310");
            value = new String(contaEL.getPerfil3Clientes().getBytes("UTF-8"));
            fv47.setValue(value);
            lfv.add(fv47);
        }

        if (contaEL.getPerfil4Clientes() != null) {
            FieldValue fv48 = new FieldValue();
            fv48.setId("100311");
            value = new String(contaEL.getPerfil4Clientes().getBytes("UTF-8"));
            fv48.setValue(value);
            lfv.add(fv48);
        }

        if (contaEL.getPerfil5Clientes() != null) {
            FieldValue fv49 = new FieldValue();
            fv49.setId("100312");
            value = new String(contaEL.getPerfil5Clientes().getBytes("UTF-8"));
            fv49.setValue(value);
            lfv.add(fv49);
        }

        if (contaEL.getPerfil6Clientes() != null) {
            FieldValue fv50 = new FieldValue();
            fv50.setId("100313");
            value = new String(contaEL.getPerfil6Clientes().getBytes("UTF-8"));
            fv50.setValue(value);
            lfv.add(fv50);
        }

        if (contaEL.getCodigoSiEmpresa() != 0) {
            PropriedadesContato propriedadesContato = RestfulClientProxy.buscarContatoEloquaPorCodSIEmpresa(
                    Integer.toString(c.getCodigoSiEmpresa()), parametrosConexaoEloqua);

            if (propriedadesContato.getElements().size() < 0) {
                FieldValue fv30 = new FieldValue();
                fv30.setId("100297");
                String emailContato = propriedadesContato.getElements().get(0).getEmailAddress();
                value = new String(contaEL.getCodigoSiEmpresa() + " - " + emailContato.getBytes("UTF-8"));
                fv30.setValue(value);
                lfv.add(fv30);
            }

        }

        if (contaEL.getPorte() != null) {
            FieldValue fv51 = new FieldValue();
            fv51.setId("100314");
            value = new String(contaEL.getPorte().getBytes("UTF-8"));
            fv51.setValue(value);
            lfv.add(fv51);
        }

        if (contaEL.getQtdSistemaMasterApi() != 0) {
            FieldValue fv52 = new FieldValue();
            fv52.setId("100294");
            value = new String(Integer.toString(contaEL.getQtdSistemaMasterApi()).getBytes("UTF-8"));
            fv52.setValue(value);
            lfv.add(fv52);
        }

        if (contaEL.getQtdSistemaMasterAppWeb() != 0) {
            FieldValue fv53 = new FieldValue();
            fv53.setId("100292");
            value = new String(Integer.toString(contaEL.getQtdSistemaMasterAppWeb()).getBytes("UTF-8"));
            fv53.setValue(value);
            lfv.add(fv53);
        }

        if (contaEL.getQtdSistemaMasterConnect() != 0) {
            FieldValue fv54 = new FieldValue();
            fv54.setId("100291");
            value = new String(Integer.toString(contaEL.getQtdSistemaMasterConnect()).getBytes("UTF-8"));
            fv54.setValue(value);
            lfv.add(fv54);
        }

        if (contaEL.getQtdSistemaMasterCont() != 0) {
            FieldValue fv55 = new FieldValue();
            fv55.setId("100287");
            value = new String(Integer.toString(contaEL.getQtdSistemaMasterCont()).getBytes("UTF-8"));
            fv55.setValue(value);
            lfv.add(fv55);
        }

        if (contaEL.getQtdSistemaMasterCorporate() != 0) {
            FieldValue fv56 = new FieldValue();
            fv56.setId("100290");
            value = new String(Integer.toString(contaEL.getQtdSistemaMasterCorporate()).getBytes("UTF-8"));
            fv56.setValue(value);
            lfv.add(fv56);
        }

        if (contaEL.getQtdSistemaMasterErp() != 0) {
            FieldValue fv57 = new FieldValue();
            fv57.setId("100289");
            value = new String(Integer.toString(contaEL.getQtdSistemaMasterErp()).getBytes("UTF-8"));
            fv57.setValue(value);
            lfv.add(fv57);
        }

        if (contaEL.getQtdSistemaMasterMobile() != 0) {
            FieldValue fv58 = new FieldValue();
            fv58.setId("100293");
            value = new String(Integer.toString(contaEL.getQtdSistemaMasterMobile()).getBytes("UTF-8"));
            fv58.setValue(value);
            lfv.add(fv58);
        }

        if (contaEL.getQtdSistemaMasterOne() != 0) {
            FieldValue fv59 = new FieldValue();
            fv59.setId("100288");
            value = new String(Integer.toString(contaEL.getQtdSistemaMasterOne()).getBytes("UTF-8"));
            fv59.setValue(value);
            lfv.add(fv59);
        }

        if (contaEL.getQuantidadeFuncionarios() != 0) {
            FieldValue fv60 = new FieldValue();
            fv60.setId("100316");
            value = new String(Integer.toString(contaEL.getQuantidadeFuncionarios()).toString().getBytes("UTF-8"));
            fv60.setValue(value);
            lfv.add(fv60);
        }

        if (contaEL.getRamoDeAtividade() != null) {
            FieldValue fv61 = new FieldValue();
            fv61.setId("100276");
            value = new String(contaEL.getRamoDeAtividade().getBytes("UTF-8"));
            fv61.setValue(value);
            lfv.add(fv61);
        }

        if (contaEL.getReceitaAnual() != null) {
            FieldValue fv62 = new FieldValue();
            fv62.setId("100317");
            value = new String(contaEL.getReceitaAnual().toString().getBytes("UTF-8"));
            fv62.setValue(value);
            lfv.add(fv62);
        }

        if (contaEL.getUniquePremiumNGMonitorado() != null) {
            FieldValue fv63 = new FieldValue();
            fv63.setId("100295");
            value = new String(contaEL.getUniquePremiumNGMonitorado().getBytes("UTF-8"));
            fv63.setValue(value);
            lfv.add(fv63);
        }

        if (contaEL.getValorContrato() != null) {
            FieldValue fv64 = new FieldValue();
            fv64.setId("100285");
            value = new String(contaEL.getValorContrato().toString().getBytes("UTF-8"));
            fv64.setValue(value);
            lfv.add(fv64);
        }

        if (contaEL.getCodigoSiEmpresa() != 0) {
            PropriedadesContato propriedadesContato2 = RestfulClientProxy.buscarContatoEloquaPorCodSIEmpresa(
                    Integer.toString(c.getCodigoSiEmpresa()), parametrosConexaoEloqua);

            if (propriedadesContato2.getElements().size() < 0) {
                FieldValue fv65 = new FieldValue();
                fv65.setId("100273");
                value = new String(propriedadesContato2.getElements().get(0).getEmailAddress().getBytes("UTF-8"));
                fv65.setValue(value);
                lfv.add(fv65);
            }

        }

        contaEloqua.setFieldValues(lfv);
        return contaEloqua;
    }

    public static ContatoEL converterContatoEloquaParaContatoEloqua(ContatoEloqua contatoEloqua)
            throws NumberFormatException, ParseException, DatatypeConfigurationException {
        ContatoEL contatoEL = new ContatoEL();

        if (getFieldValue("100267", contatoEloqua) != null && !getFieldValue("100267", contatoEloqua).equals("0")
                && !getFieldValue("100216", contatoEloqua).isEmpty()) {
            
            contatoEL.setCodigoSiEmpresa(Integer.parseInt(getFieldValue("100267", contatoEloqua)));
            
            if (contatoEloqua.getEmailAddress() != null && !contatoEloqua.getEmailAddress().isEmpty()) {
                contatoEL.setEmailAddress(contatoEloqua.getEmailAddress());
            }

            if (contatoEloqua.getFirstName() != null && !contatoEloqua.getFirstName().isEmpty()) {
                contatoEL.setFirstName(contatoEloqua.getFirstName());
            }

            if (contatoEloqua.getBusinessPhone() != null && !contatoEloqua.getBusinessPhone().isEmpty()) {
                contatoEL.setBusinessPhone(contatoEloqua.getBusinessPhone());
            }

            if (contatoEloqua.getMobilePhone() != null && !contatoEloqua.getMobilePhone().isEmpty()) {
                contatoEL.setCelular(contatoEloqua.getMobilePhone());
            }

            if (contatoEloqua.getLastName() != null && !contatoEloqua.getLastName().isEmpty()) {
                contatoEL.setLastName(contatoEloqua.getLastName());
            }

            if (contatoEloqua.getSalesPerson() != null && !contatoEloqua.getSalesPerson().isEmpty()) {
                contatoEL.setSalesperson(contatoEloqua.getSalesPerson());
            }

            if (contatoEloqua.getTitle() != null && !contatoEloqua.getTitle().isEmpty()) {
                contatoEL.setTitle(contatoEloqua.getTitle());
            }

            if (getFieldValue("100217", contatoEloqua) != null && !getFieldValue("100217", contatoEloqua).isEmpty()) {
                Date dataNascimento = ConversaoDeData.getDate(Long.parseLong(getFieldValue("100217", contatoEloqua)));
                Calendar calendarDataNascimento = Calendar.getInstance();
                calendarDataNascimento.setTime(dataNascimento);
                contatoEL.setDiaNascimento(calendarDataNascimento.get(Calendar.DAY_OF_MONTH));
                contatoEL.setMesNascimento(calendarDataNascimento.get(Calendar.MONTH));
                contatoEL.setAnoNascimento(calendarDataNascimento.get(Calendar.YEAR));
            }

            if (getFieldValue("100217", contatoEloqua) != null && !getFieldValue("100217", contatoEloqua).isEmpty()) {
                contatoEL.setDataUltAtualizacao(Conversor.dateToXMLGregorianCalendar(
                        ConversaoDeData.getDate(Long.parseLong(getFieldValue("100217", contatoEloqua)))));
            }

            if (getFieldValue("100214", contatoEloqua) != null && !getFieldValue("100214", contatoEloqua).isEmpty()) {
                contatoEL.setAfinidade(getFieldValue("100214", contatoEloqua));
            }

            if (getFieldValue("100222", contatoEloqua) != null && !getFieldValue("100222", contatoEloqua).isEmpty()) {
                contatoEL.setApelido(getFieldValue("100222", contatoEloqua));
            }

            if (getFieldValue("100222", contatoEloqua) != null && !getFieldValue("100222", contatoEloqua).isEmpty()) {
                contatoEL.setApelido(getFieldValue("100222", contatoEloqua));
            }

            if (getFieldValue("100204", contatoEloqua) != null && !getFieldValue("100204", contatoEloqua).isEmpty()) {
                contatoEL.setCadastroNaUniversidade(getFieldValue("100204", contatoEloqua));
            }                

            if (getFieldValue("100216", contatoEloqua) != null && !getFieldValue("100216", contatoEloqua).isEmpty()) {
                contatoEL.setContatoPreferencial(getFieldValue("100216", contatoEloqua));
            }

            if (getFieldValue("100208", contatoEloqua) != null && !getFieldValue("100208", contatoEloqua).isEmpty()) {
                contatoEL.setCursoFormacaoSuperiorTecnica(getFieldValue("100208", contatoEloqua));
            }

            if (getFieldValue("100215", contatoEloqua) != null && !getFieldValue("100215", contatoEloqua).isEmpty()) {
                contatoEL.setDecisaoParaCompra(getFieldValue("100215", contatoEloqua));
            }

            if (getFieldValue("100196", contatoEloqua) != null && !getFieldValue("100196", contatoEloqua).isEmpty()) {
                contatoEL.setDetalhamentoHobby(getFieldValue("100196", contatoEloqua));
            }

            if (getFieldValue("100218", contatoEloqua) != null && !getFieldValue("100218", contatoEloqua).isEmpty()) {
                contatoEL.setEscolaridade(getFieldValue("100218", contatoEloqua));
            }

            if (getFieldValue("100220", contatoEloqua) != null && !getFieldValue("100220", contatoEloqua).isEmpty()) {
                contatoEL.setEstadoCivil(getFieldValue("100220", contatoEloqua));
            }

            if (getFieldValue("100197", contatoEloqua) != null && !getFieldValue("100197", contatoEloqua).isEmpty()) {
                BigDecimal bd = new BigDecimal(getFieldValue("100197", contatoEloqua));
                contatoEL.setFaixaSalarial(bd);
            }

            if (getFieldValue("100259", contatoEloqua) != null && !getFieldValue("100259", contatoEloqua).isEmpty()) {
                contatoEL.setFuncao(getFieldValue("100259", contatoEloqua));
            }

            if (getFieldValue("100223", contatoEloqua) != null && !getFieldValue("100223", contatoEloqua).isEmpty()) {
                contatoEL.setHobby(getFieldValue("100223", contatoEloqua));
            }

            if (getFieldValue("100209", contatoEloqua) != null && !getFieldValue("100209", contatoEloqua).isEmpty()) {
                contatoEL.setInstituicaoFormacaoSuperiorTecnica(getFieldValue("100209", contatoEloqua));
            }

            if (getFieldValue("100221", contatoEloqua) != null && !getFieldValue("100221", contatoEloqua).isEmpty()) {
                contatoEL.setNaturezaOcupacao(getFieldValue("100221", contatoEloqua));
            }

            if (getFieldValue("100213", contatoEloqua) != null && !getFieldValue("100213", contatoEloqua).isEmpty()) {
                contatoEL.setNivelHierarquico(getFieldValue("100213", contatoEloqua));
            }

            if (getFieldValue("100224", contatoEloqua) != null && !getFieldValue("100224", contatoEloqua).isEmpty()) {
                contatoEL.setNivelInfluencia(getFieldValue("100224", contatoEloqua));
            }

            if (getFieldValue("100219", contatoEloqua) != null && !getFieldValue("100219", contatoEloqua).isEmpty()) {
                contatoEL.setSexo(getFieldValue("100219", contatoEloqua));
            }

            if (getFieldValue("100210", contatoEloqua) != null && !getFieldValue("100210", contatoEloqua).isEmpty()) {
                contatoEL.setSiteBlog(getFieldValue("100210", contatoEloqua));
            }

            if (getFieldValue("100205", contatoEloqua) != null && !getFieldValue("100205", contatoEloqua).isEmpty()) {
                contatoEL.setTamanhoCamiseta(getFieldValue("100205", contatoEloqua));
            }

            if (getFieldValue("100206", contatoEloqua) != null && !getFieldValue("100206", contatoEloqua).isEmpty()) {
                contatoEL.setTimeFutebol(getFieldValue("100206", contatoEloqua));
            }

            if (getFieldValue("100207", contatoEloqua) != null && !getFieldValue("100207", contatoEloqua).isEmpty()) {
                contatoEL.setTipoMusicaFavorita(getFieldValue("100207", contatoEloqua));
            }
            
            return contatoEL;
        }
        
        else {
            return null;
        }

    }

    public static Date XMLGregorianCalendarToDate(XMLGregorianCalendar dataEmXMLGregorianCalendar) {
        XMLGregorianCalendar xgc = dataEmXMLGregorianCalendar;
        Date timestamp = xgc.toGregorianCalendar().getTime();
        return timestamp;
    }

    public static String converterContatoEloqua2Json(ContatoEloqua contatoEloqua) throws IOException {
        String resultado = new GsonBuilder().disableHtmlEscaping().create().toJson(contatoEloqua, ContatoEloqua.class);
        resultado = new String(resultado.getBytes("UTF-8"));
        return resultado;
    }

    public static PropriedadesContato converterJson2ContatoEloqua(String json) {
        Gson gson = new Gson();
        PropriedadesContato propriedadeContato = gson.fromJson(json, PropriedadesContato.class);
        return propriedadeContato;
    }

    public static String converterContaEloqua2Json(ContaEloqua contaEloqua) throws IOException {
        String resultado = new GsonBuilder().disableHtmlEscaping().create().toJson(contaEloqua, ContaEloqua.class);
        resultado = new String(resultado.getBytes("UTF-8"));
        return resultado;
    }

    public static PropriedadesConta converterJson2ContaEloqua(String json) {
        Gson gson = new Gson();
        PropriedadesConta propriedadeConta = gson.fromJson(json, PropriedadesConta.class);
        return propriedadeConta;
    }

    public static String getFieldValue(String id, ContatoEloqua contatoEloqua) {
        String value = "";

        if (contatoEloqua.getFieldValues() != null) {

            for (FieldValue fieldValue : contatoEloqua.getFieldValues()) {

                if (fieldValue.getId().equals(id)) {
                    value = fieldValue.getValue();
                }

            }

        }

        return value;
    }

    public static XMLGregorianCalendar dateToXMLGregorianCalendar(Date data)
            throws ParseException, DatatypeConfigurationException {
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(data);
        XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar();
        return date2;
    }

}