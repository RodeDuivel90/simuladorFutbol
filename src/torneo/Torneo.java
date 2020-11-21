/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

import java.util.*;
import javax.swing.ImageIcon;


/**
 *
 * @author Miguel
 */
public class Torneo {   
   
    static ArrayList<Equipos> selecciones = new ArrayList<> ();
    static ArrayList<Equipos> campeones= new ArrayList<>();
    static ArrayList<Equipos> euroCampeones= new ArrayList<>();
    static ArrayList<Equipos> americaCampeones= new ArrayList<>();
    static ArrayList<Equipos> hosts= new ArrayList<>();
    static ArrayList<ArrayList<Equipos>> tablaClasif = new ArrayList<>();
    static ArrayList<Partidos> todosPartidos= new ArrayList<>();
    ArrayList<Equipos> elim= new ArrayList<>();
    static ArrayList<Equipos> mundial34= new ArrayList<>();
    static ArrayList<ArrayList<Equipos>> tablas = new ArrayList<>();
    static Equipos Arg=new Equipos("ARGENTINA     ",1,0,0,0,2077,"conmebol",0);    
    static Equipos fra=new Equipos("FRANCIA       ",2,0,0,0,1522,"uefa",0);
    static Equipos mex=new Equipos("MÉXICO        ",3,0,0,0,1578,"concacaf",0);
    static Equipos chi=new Equipos("CHILE         ",3,0,0,0,1613,"conmebol",0);
    static Equipos srb=new Equipos("YUGOSLAVIA    ",2,0,0,0,1575,"uefa",0);
    static Equipos bra=new Equipos("BRASIL        ",1,0,0,0,1930,"conmebol",0);
    static Equipos bol=new Equipos("BOLIVIA       ",4,0,0,0,1259,"conmebol",0);
    static Equipos rou=new Equipos("RUMANIA       ",3,0,0,0,1566,"uefa",0);
    static Equipos per=new Equipos("PERÚ          ",3,0,0,0,1542,"conmebol",0);
    static Equipos uru=new Equipos("URUGUAY       ",1,0,0,0,1972,"conmebol",0);
    static Equipos usa=new Equipos("ESTADOS UNIDOS",3,0,0,0,1686,"concacaf",0);
    static Equipos bel=new Equipos("BÉLGICA       ",3,0,0,0,1636,"uefa",0);
    static Equipos par=new Equipos("PARAGUAY      ",3,0,0,0,1780,"conmebol",0);
    static Equipos swe=new Equipos("SUECIA        ",2,0,0,0,1691,"uefa",0);
    static Equipos est=new Equipos("ESTONIA       ",5,0,0,0,1281,"uefa",0);
    static Equipos ltu=new Equipos("LITUANIA      ",5,0,0,0,1121,"uefa",0);
    static Equipos esp=new Equipos("ESPAÑA        ",2,0,0,0,1909,"uefa",0);
    static Equipos por=new Equipos("PORTUGAL      ",4,0,0,0,1697,"uefa",0);
    static Equipos ita=new Equipos("ITALIA        ",1,0,0,0,1972,"uefa",0);
    static Equipos gre=new Equipos("GRECIA        ",4,0,0,0,1291,"uefa",0);
    static Equipos bul=new Equipos("BULGARIA      ",4,0,0,0,1446,"uefa",0);
    static Equipos hun=new Equipos("HUNGRÍA       ",1,0,0,0,1797,"uefa",0);
    static Equipos aut=new Equipos("AUSTRIA       ",2,0,0,0,2047,"uefa",0);
    static Equipos pol=new Equipos("POLONIA       ",3,0,0,0,1680,"uefa",0);
    static Equipos cze=new Equipos("CHECOSLOVAQUIA",2,0,0,0,1817,"uefa",0);
    static Equipos sui=new Equipos("SUIZA         ",2,0,0,0,1626,"uefa",0);
    static Equipos irl=new Equipos("IRLANDA       ",3,0,0,0,1661,"uefa",0);
    static Equipos ned=new Equipos("HOLANDA       ",2,0,0,0,1665,"uefa",0);
    static Equipos lux=new Equipos("LUXEMBURGO    ",5,0,0,0,1283,"uefa",0);
    static Equipos ger=new Equipos("ALEMANIA      ",1,0,0,0,1792,"uefa",0);
    static Equipos hai=new Equipos("HAITÍ         ",6,0,0,0,1289,"concacaf",0);
    static Equipos cub=new Equipos("CUBA          ",5,0,0,0,1676,"concacaf",0);
    static Equipos egy=new Equipos("EGIPTO        ",3,0,0,0,1701,"caf",0);
    static Equipos isr=new Equipos("PALESTINA (MB)",6,0,0,0,1300,"afc",0);
    static Equipos nor=new Equipos("NORUEGA       ",2,0,0,0,1725,"uefa",0);
    static Equipos lva=new Equipos("LETONIA       ",4,0,0,0,1353,"uefa",0);
    static Equipos fin=new Equipos("FINLANDIA     ",4,0,0,0,1434,"uefa",0);
    static Equipos ina=new Equipos("INDONESIA     ",4,0,0,0,1467,"afc",0);
    static Equipos eng=new Equipos("INGLATERRA    ",1,0,0,0,2009,"uefa",0);
    static Equipos sco=new Equipos("ESCOCIA       ",2,0,0,0,1918,"uefa",0);
    static Equipos wal=new Equipos("GALES         ",3,0,0,0,1790,"uefa",0);
    static Equipos nir=new Equipos("IRLANDA DEL N.",3,0,0,0,1669,"uefa",0);
    static Equipos saa=new Equipos("SARRE         ",4,0,0,0,1600,"uefa",0);
    static Equipos tur=new Equipos("TURQUÍA       ",3,0,0,0,1582,"uefa",0);
    static Equipos jpn=new Equipos("JAPÓN         ",5,0,0,0,1345,"afc",0);
    static Equipos kor=new Equipos("COREA DEL SUR ",4,0,0,0,1747,"afc",0);
    static Equipos rus=new Equipos("URSS          ",2,0,0,0,1814,"uefa",0);
    static Equipos den=new Equipos("DINAMARCA     ",4,0,0,0,1598,"uefa",0);
    static Equipos isl=new Equipos("ISLANDIA      ",5,0,0,0,1393,"uefa",0);
    static Equipos gdr=new Equipos("RD ALEMANIA   ",3,0,0,0,1555,"uefa",0);
    static Equipos col=new Equipos("COLOMBIA      ",3,0,0,0,1423,"conmebol",0);
    static Equipos gua=new Equipos("GUATEMALA     ",6,0,0,0,1448,"concacaf",0);
    static Equipos can=new Equipos("CANADÁ        ",5,0,0,0,1611,"concacaf",0);
    static Equipos ant=new Equipos("ANTILLAS HOL. ",6,0,0,0,1518,"concacaf",0);
    static Equipos crc=new Equipos("COSTA RICA    ",3,0,0,0,1742,"concacaf",0);
    static Equipos eth=new Equipos("ETIOPÍA       ",4,0,0,0,1341,"caf",0);
    static Equipos cyp=new Equipos("CHIPRE        ",5,0,0,0,1393,"uefa",0);
    static Equipos ecu=new Equipos("ECUADOR       ",4,0,0,0,1318,"conmebol",0);
    static Equipos hon=new Equipos("HONDURAS      ",4,0,0,0,1432,"concacaf",0);
    static Equipos sur=new Equipos("SURINAM       ",5,0,0,0,1383,"concacaf",0);
    static Equipos mar=new Equipos("MARRUECOS     ",3,0,0,0,1582,"caf",0);
    static Equipos tun=new Equipos("TÚNEZ         ",3,0,0,0,1417,"caf",0);
    static Equipos gha=new Equipos("GHANA         ",3,0,0,0,1640,"caf",0);
    static Equipos nga=new Equipos("NIGERIA       ",4,0,0,0,1512,"caf",0);
    static Equipos alb=new Equipos("ALBANIA       ",5,0,0,0,1427,"uefa",0);
    static Equipos mlt=new Equipos("MALTA         ",6,0,0,0,1235,"uefa",0);
    static Equipos ven=new Equipos("VENEZUELA     ",5,0,0,0,1369,"conmebol",0);
    static Equipos jam=new Equipos("JAMAICA       ",6,0,0,0,1228,"concacaf",0);
    static Equipos tri=new Equipos("TRINIDAD Y T. ",6,0,0,0,1401,"concacaf",0);
    static Equipos prk=new Equipos("COREA DEL N.  ",1,0,0,0,1618,"afc",0);
    static Equipos aus=new Equipos("AUSTRALIA     ",3,0,0,0,1502,"afc",0);
    static Equipos ber=new Equipos("BERMUDA       ",6,0,0,0,1331,"concacaf",0);
    static Equipos slv=new Equipos("EL SALVADOR   ",3,0,0,0,1480,"concacaf",0);
    static Equipos zam=new Equipos("ZAMBIA        ",4,0,0,0,1591,"caf",0);
    static Equipos sud=new Equipos("SUDÁN         ",4,0,0,0,1558,"caf",0);
    static Equipos sen=new Equipos("SENEGAL       ",3,0,0,0,1545,"caf",0);
    static Equipos alg=new Equipos("ARGELIA       ",3,0,0,0,1622,"caf",0);
    static Equipos cmr=new Equipos("CAMERÚN       ",4,0,0,0,1529,"caf",0);
    static Equipos lby=new Equipos("LIBIA         ",5,0,0,0,1474,"caf",0);
    static Equipos zim=new Equipos("RHODESIA      ",4,0,0,0,1450,"afc",0);
    static Equipos nzl=new Equipos("NUEVA ZELANDA ",4,0,0,0,1453,"afc",0);
    static Equipos pur=new Equipos("PUERTO RICO   ",6,0,0,0,902,"concacaf",0);
    static Equipos atg=new Equipos("ANTIGUA Y BAR.",6,0,0,0,1204,"concacaf",0);
    static Equipos gui=new Equipos("GUINEA        ",3,0,0,0,1574,"caf",0);
    static Equipos sle=new Equipos("SIERRA LEONA  ",5,0,0,0,1464,"caf",0);
    static Equipos civ=new Equipos("C. DE MARFIL  ",4,0,0,0,1596,"caf",0);
    static Equipos ken=new Equipos("KENIA         ",4,0,0,0,1336,"caf",0);
    static Equipos mri=new Equipos("MAURICIO      ",5,0,0,0,1415,"caf",0);
    static Equipos mad=new Equipos("MADAGASCAR    ",5,0,0,0,1385,"caf",0);
    static Equipos tan=new Equipos("TANZANIA      ",5,0,0,0,1344,"caf",0);
    static Equipos les=new Equipos("LESOTHO       ",6,0,0,0,1176,"caf",0);
    static Equipos cgo=new Equipos("CONGO         ",4,0,0,0,1622,"caf",0);
    static Equipos ben=new Equipos("BENIN         ",6,0,0,0,1346,"caf",0);
    static Equipos tog=new Equipos("TOGO          ",6,0,0,0,1432,"caf",0);
    static Equipos cod=new Equipos("ZAIRE         ",2,0,0,0,1609,"caf",0);
    static Equipos gab=new Equipos("GABÓN         ",6,0,0,0,1331,"caf",0);
    static Equipos vie=new Equipos("VIETNAM DEL S.",5,0,0,0,1276,"afc",0);
    static Equipos hkg=new Equipos("HONG KONG     ",3,0,0,0,1215,"afc",0);
    static Equipos mas=new Equipos("MALASIA       ",4,0,0,0,1421,"afc",0);
    static Equipos tha=new Equipos("TAILANDIA     ",6,0,0,0,1306,"afc",0);
    static Equipos syr=new Equipos("SIRIA         ",3,0,0,0,1418,"afc",0);
    static Equipos irn=new Equipos("IRÁN          ",1,0,0,0,1592,"afc",0);
    static Equipos kuw=new Equipos("KUWAIT        ",2,0,0,0,1430,"afc",0);
    static Equipos irq=new Equipos("IRAK          ",2,0,0,0,1524,"afc",0);
    static Equipos pan=new Equipos("PANAMÁ        ",5,0,0,0,1269,"concacaf",0);
    static Equipos guy=new Equipos("GUYANA        ",5,0,0,0,1329,"concacaf",0);
    static Equipos brb=new Equipos("BARBADOS      ",6,0,0,0,1172,"concacaf",0);
    static Equipos dom=new Equipos("R. DOMINICANA ",6,0,0,0,1011,"concacaf",0);
    static Equipos nig=new Equipos("NÍGER         ",6,0,0,0,1188,"caf",0);
    static Equipos bfa=new Equipos("BURKINA FASO  ",5,0,0,0,1292,"caf",0);
    static Equipos mtn=new Equipos("MAURITANIA    ",6,0,0,0,1152,"caf",0);
    static Equipos cta=new Equipos("REP. CENTROAF.",6,0,0,0,1245,"caf",0);
    static Equipos mwi=new Equipos("MALAWI        ",5,0,0,0,1327,"caf",0);
    static Equipos uga=new Equipos("UGANDA        ",5,0,0,0,1468,"caf",0);
    static Equipos sin=new Equipos("SINGAPUR      ",5,0,0,0,1200,"afc",0);
    static Equipos ksa=new Equipos("ARABIA SAUDITA",3,0,0,0,1380,"afc",0);
    static Equipos bhr=new Equipos("BAHREIN       ",3,0,0,0,1225,"afc",0);
    static Equipos qat=new Equipos("QATAR         ",4,0,0,0,1308,"afc",0);
    static Equipos tpe=new Equipos("CHINA TAIPEI  ",6,0,0,0,1285,"afc",0);
    static Equipos grn=new Equipos("GRENADA       ",6,0,0,0,1311,"concacaf",0);
    static Equipos som=new Equipos("SOMALIA       ",6,0,0,0,1026,"caf",0);
    static Equipos gam=new Equipos("GAMBIA        ",5,0,0,0,1310,"caf",0);
    static Equipos moz=new Equipos("MOZAMBIQUE    ",5,0,0,0,1358,"caf",0);
    static Equipos lbr=new Equipos("LIBERIA       ",5,0,0,0,1285,"caf",0);
    static Equipos fij=new Equipos("FIJI          ",6,0,0,0,1246,"afc",0);
    static Equipos mac=new Equipos("MACAO         ",4,0,0,0,1124,"afc",0);
    static Equipos chn=new Equipos("CHINA         ",2,0,0,0,1502,"afc",0);
    static Equipos ang=new Equipos("ANGOLA        ",4,0,0,0,1474,"caf",0);
    static Equipos uae=new Equipos("EMIRATOS ARAB.",2,0,0,0,1326,"afc",0);
    static Equipos jor=new Equipos("JORDANIA      ",4,0,0,0,1227,"afc",0);
    static Equipos nye=new Equipos("YEMEN DEL N.  ",6,0,0,0,1060,"afc",0);
    static Equipos yem=new Equipos("YEMEN DEL SUR ",6,0,0,0,1161,"afc",0);
    static Equipos nep=new Equipos("NEPAL         ",6,0,0,0,911,"afc",0);
    static Equipos bru=new Equipos("BRUNEI        ",6,0,0,0,854,"afc",0);
    static Equipos ban=new Equipos("BANGLADESH    ",5,0,0,0,1090,"afc",0);
    static Equipos ind=new Equipos("INDIA         ",5,0,0,0,1228,"afc",0);
    static Equipos rwa=new Equipos("RUANDA        ",5,0,0,0,1251,"caf",0);
    static Equipos omn=new Equipos("OMÁN          ",4,0,0,0,1070,"afc",0);
    static Equipos pak=new Equipos("PAKISTÁN      ",6,0,0,0,1109,"afc",0);
    static Equipos smr=new Equipos("SAN MARINO    ",6,0,0,0,1000,"uefa",0);
    static Equipos fro=new Equipos("ISLAS FAROE   ",5,0,0,0,1145,"uefa",0);
    static Equipos lca=new Equipos("SANTA LUCÍA   ",5,0,0,0,1267,"concacaf",0);
    static Equipos vin=new Equipos("S. VINCENTE G.",5,0,0,0,1284,"concacaf",0);
    static Equipos nca=new Equipos("NICARAGUA     ",6,0,0,0,1044,"concacaf",0);
    static Equipos rsa=new Equipos("SUDÁFRICA     ",3,0,0,0,1688,"caf",0);
    static Equipos bot=new Equipos("BOTSWANA      ",5,0,0,0,1067,"caf",0);
    static Equipos nam=new Equipos("NAMIBIA       ",6,0,0,0,1251,"caf",0);
    static Equipos bdi=new Equipos("BURUNDI       ",4,0,0,0,1354,"caf",0);
    static Equipos swz=new Equipos("SWAZILANDIA   ",4,0,0,0,1214,"caf",0);
    static Equipos lib=new Equipos("LÍBANO        ",4,0,0,0,1259,"afc",0);
    static Equipos sri=new Equipos("SRI LANKA     ",6,0,0,0,921,"afc",0);
    static Equipos sol=new Equipos("I. SOLOMÓN    ",5,0,0,0,1258,"ofc",0);
    static Equipos tah=new Equipos("TAHITÍ        ",5,0,0,0,1490,"ofc",0);
    static Equipos van=new Equipos("VANUATU       ",6,0,0,0,1101,"ofc",0);
    static Equipos aze=new Equipos("AZERBAIYÁN    ",5,0,0,0,1371,"uefa",0);
    static Equipos mkd=new Equipos("MACEDONIA     ",4,0,0,0,1521,"uefa",0);
    static Equipos blr=new Equipos("BELARÚS       ",4,0,0,0,1403,"uefa",0);
    static Equipos arm=new Equipos("ARMENIA       ",4,0,0,0,1357,"uefa",0);
    static Equipos svn=new Equipos("ESLOVENIA     ",4,0,0,0,1516,"uefa",0);
    static Equipos cro=new Equipos("CROACIA       ",2,0,0,0,1808,"uefa",0);
    static Equipos geo=new Equipos("GEORGIA       ",4,0,0,0,1497,"uefa",0);
    static Equipos lie=new Equipos("LIECHTENSTEIN ",6,0,0,0,1135,"uefa",0);
    static Equipos mda=new Equipos("MOLDAVIA      ",4,0,0,0,1402,"uefa",0);
    static Equipos svk=new Equipos("ESLOVAQUIA    ",3,0,0,0,1582,"uefa",0);
    static Equipos ukr=new Equipos("UCRANIA       ",2,0,0,0,1602,"uefa",0);
    static Equipos cay=new Equipos("ISLAS CAYMÁN  ",6,0,0,0,1124,"concacaf",0);
    static Equipos aru=new Equipos("ARUBA         ",5,0,0,0,1032,"concacaf",0);
    static Equipos skn=new Equipos("SAN CRISTOBAL ",4,0,0,0,1210,"concacaf",0);
    static Equipos bah=new Equipos("BAHAMAS       ",6,0,0,0,858,"concacaf",0);
    static Equipos dma=new Equipos("DOMINICA      ",5,0,0,0,1181,"concacaf",0);
    static Equipos blz=new Equipos("BELICE        ",4,0,0,0,996,"concacaf",0);
    static Equipos gbi=new Equipos("GUINEA BISSAU ",5,0,0,0,1247,"caf",0);
    static Equipos uzb=new Equipos("UZBEKISTÁN    ",3,0,0,0,1506,"afc",0);
    static Equipos mdv=new Equipos("I. MALDIVAS   ",6,0,0,0,831,"afc",0);
    static Equipos kgz=new Equipos("KIRGUISTÁN    ",4,0,0,0,1188,"afc",0);
    static Equipos tjk=new Equipos("TAYIKISTÁN    ",4,0,0,0,1466,"afc",0);
    static Equipos phi=new Equipos("FILIPINAS     ",6,0,0,0,792,"afc",0);
    static Equipos tkm=new Equipos("TURKMENISTÁN  ",4,0,0,0,1378,"afc",0);
    static Equipos kaz=new Equipos("KAZAJISTÁN    ",3,0,0,0,1408,"afc",0);
    static Equipos cam=new Equipos("CAMBOYA       ",6,0,0,0,1031,"afc",0);
    static Equipos cok=new Equipos("I. COOK       ",6,0,0,0,919,"ofc",0);
    static Equipos png=new Equipos("PAPÚA N. G.   ",5,0,0,0,1104,"ofc",0);
    static Equipos sam=new Equipos("SAMOA         ",6,0,0,0,839,"ofc",0);
    static Equipos tga=new Equipos("TONGA         ",6,0,0,0,921,"ofc",0);
    static Equipos bih=new Equipos("BOSNIA        ",4,0,0,0,1496,"uefa",0);
    static Equipos and=new Equipos("ANDORRA       ",6,0,0,0,1061,"uefa",0);
    static Equipos tca=new Equipos("TURCOS Y C.   ",6,0,0,0,694,"concacaf",0);
    static Equipos vgb=new Equipos("I. VIRG. BR.  ",6,0,0,0,900,"concacaf",0);
    static Equipos aia=new Equipos("ANGUILA       ",6,0,0,0,616,"concacaf",0);
    static Equipos vir=new Equipos("I. VÍRGENES   ",6,0,0,0,800,"concacaf",0);
    static Equipos msr=new Equipos("MONTSERRAT    ",5,0,0,0,730,"concacaf",0);
    static Equipos cha=new Equipos("CHAD          ",5,0,0,0,1268,"caf",0);
    static Equipos mli=new Equipos("MALÍ          ",3,0,0,0,1475,"caf",0);
    static Equipos sey=new Equipos("SEYCHELLES    ",6,0,0,0,998,"caf",0);
    static Equipos stp=new Equipos("S. TOMÉ Y P.  ",6,0,0,0,986,"caf",0);
    static Equipos dji=new Equipos("YIBUTÍ        ",6,0,0,0,873,"caf",0);
    static Equipos cpv=new Equipos("CABO VERDE    ",4,0,0,0,1244,"caf",0);
    static Equipos eri=new Equipos("ERITREA       ",5,0,0,0,1179,"caf",0);
    static Equipos eqg=new Equipos("GUINEA ECUAT. ",6,0,0,0,1054,"caf",0);
    static Equipos lao=new Equipos("LAOS          ",6,0,0,0,899,"afc",0);
    static Equipos gum=new Equipos("GUAM          ",6,0,0,0,719,"afc",0);
    static Equipos ple=new Equipos("PALESTINA     ",4,0,0,0,1244,"afc",0);
    static Equipos mgl=new Equipos("MONGOLIA      ",6,0,0,0,768,"afc",0);
    static Equipos asa=new Equipos("SAMOA AMER.   ",6,0,0,0,593,"ofc",0);
    static Equipos ncl=new Equipos("NVA. CALEDONIA",5,0,0,0,1250,"ofc",0);
    static Equipos afg=new Equipos("AFGANISTÁN    ",6,0,0,0,913,"afc",0);
    static Equipos com=new Equipos("COMOROS       ",6,0,0,0,862,"caf",0);
    static Equipos mya=new Equipos("MYANMAR       ",6,0,0,0,1178,"afc",0);
    static Equipos bhu=new Equipos("BHUTÁN        ",6,0,0,0,563,"afc",0);
    static Equipos tle=new Equipos("TIMOR ORIENTAL",6,0,0,0,590,"afc",0);
    static Equipos mne=new Equipos("MONTENEGRO    ",4,0,0,0,1683,"uefa",0);
    static Equipos gib=new Equipos("GIBRALTAR     ",6,0,0,0,1115,"uefa",0);
    static Equipos ssd=new Equipos("SUDÁN DEL SUR ",6,0,0,0,1088,"caf",0);
    static Equipos kos=new Equipos("KOSOVO        ",5,0,0,0,1400,"uefa",0);
    static int [] anyos={1930,1934,1938,1950,1954,1958,1962,1966,1970,1974,1978,1982,1986,1990,1994,
        1998,2002,2006,2010,2014,2018};
    static int continuar=0;
    
       
    public static void main(String[] args) {    
    
    Torneo t = new Torneo();   
    
   
    Torneo.hosts.add(ger);
    Torneo.hosts.add(ita);
    Torneo.hosts.add(esp);
    Torneo.hosts.add(fra);
    Torneo.hosts.add(srb);
    Torneo.hosts.add(swe);
    Torneo.hosts.add(eng);
    Torneo.hosts.add(bel);
    Torneo.hosts.add(ned);
    Torneo.hosts.add(sui);
    Torneo.hosts.add(rus);
    Torneo.hosts.add(cze);
    Torneo.hosts.add(sco);
    Torneo.hosts.add(aut);
    Torneo.hosts.add(pol);
    t.m1930();
    t.m1934();
    t.m1938();
    t.m1950();
    t.m1954();
    t.mundiales();
    
    
 
    }
    
    public void mundiales(){
        mundial1958.wc1958();
        cont1960.copas1960();
        mundial1962.wc1962();
        cont1964.copas1964();
        mundial1966.wc1966();
        cont1968.copas1968();
        mundial1970.wc1970();
        cont1972.copas1972();
        mundial1974.wc1974();
        cont1976.copas1976();
        mundial1978.wc1978();
        cont1980.copas1980();
        mundial1982.wc1982();
        cont1984.copas1984();
        mundial1986.wc1986();
        cont1988.copas1988();
        mundial1990.wc1990();
        cont1992.copas1992();
        mundial1994.wc1994();
        cont1996.copas1996();
        mundial1998.wc1998();
        cont2000.copas2000();
        mundial2002.wc2002();
        cont2004.copas2004();
        mundial2006.wc2006();
        cont2008.copas2008();
        mundial2010.wc2010();
        cont2012.copas2012();
        mundial2014.wc2014();
        cont2016.copas2016();
        mundial2018.wc2018();
        Resetear(Torneo.selecciones);
        Grupos.resultadosEquipo(bra);
        System.out.println(Torneo.todosPartidos.size());
        Grupos.tablaMundial(todosPartidos);
        Grupos.Tablas(tablaClasif);
        
        
    }
    
    
   
    
    static public ArrayList<Equipos> confed(String conf,ArrayList<Equipos> array){
        ArrayList<Equipos> nuevo= new ArrayList<>();
        for(int i=0;i<array.size();i++){
            if(array.get(i).conf.equals(conf))
                nuevo.add(array.get(i));
    }
        return nuevo;
    }
    
    
    
    public void Eliminar(ArrayList<Equipos> array,String a){
        for(int i=0;i<array.size();i++){
            if(array.get(i).nombre.equals(a)){
                array.remove(i);
            }
        }
    }
    
    public void m1954(){
        Resetear(selecciones);
        selecciones.add(saa);
        selecciones.add(tur);
        selecciones.add(jpn);
        selecciones.add(kor);
        ger.nombre="RF ALEMANIA   ";
        nor.nivel=4;
        fin.nivel=4;
        irl.nivel=3;
        isr.nivel=3;
        egy.nivel=3;
        usa.nivel=5;
        elim.clear();
        for(int i=0;i<selecciones.size();i++)
        elim.add(selecciones.get(i));
        elim.remove(ned);
        elim.remove(cub);
        elim.remove(bol);
        elim.remove(per);
        elim.remove(Arg);
        if(campeones.get(3).conf.equals("conmebol")&&elim.contains(campeones.get(3))){
            m1954conm();
        }else if(campeones.get(3).conf.equals("uefa")&&elim.contains(campeones.get(3))&&!campeones.get(3).nombre.equals(sui.nombre)
                ||campeones.get(3).nombre.equals(isr.nombre)){
            m1954uefa();
        }else if(campeones.get(3).conf.equals("concacaf")&&elim.contains(campeones.get(3))){
            m1954conc();
        }else{
            m1954sui();
        }
        Grupos.clasificacion(Torneo.sui.nombre, Torneo.campeones.get(4));
        
    }
    
    public void m1954conm(){
        ArrayList<Equipos> mundial= new ArrayList<>();
        ArrayList<Equipos> uefa= new ArrayList<>();
        ArrayList<Equipos> conmebol= new ArrayList<>();
        ArrayList<Equipos> concacaf= new ArrayList<>();
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();
        mundial.add(sui);
        mundial.add(campeones.get(3));
        elim.remove(campeones.get(3));
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("uefa"))
            uefa.add(elim.get(i));
        }
        Collections.sort(uefa, rankingElo());
        uefa.remove(sui);
        uefa.add(egy);
        uefa.add(isr);
        grilla=chopped(uefa,11,5,11);
        gruposUefa=Mezclar(grilla);
        grupo3vuelta(gruposUefa.get(0),40,1,mundial);
        grupo3vuelta(gruposUefa.get(1),40,1,mundial);
        grupo3vuelta(gruposUefa.get(2),40,1,mundial);
        grupo3vuelta(gruposUefa.get(3),40,1,mundial);
        grupo3vuelta(gruposUefa.get(4),40,1,mundial);
        Serie(gruposUefa.get(5).get(0),gruposUefa.get(5).get(1),40,mundial);
        Serie(gruposUefa.get(6).get(0),gruposUefa.get(6).get(1),40,mundial);
        Serie(gruposUefa.get(7).get(0),gruposUefa.get(7).get(1),40,mundial);
        Serie(gruposUefa.get(8).get(0),gruposUefa.get(8).get(1),40,mundial);
        Serie(gruposUefa.get(9).get(0),gruposUefa.get(9).get(1),40,mundial);
        Serie(gruposUefa.get(10).get(0),gruposUefa.get(10).get(1),40,mundial);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("conmebol"))
            conmebol.add(elim.get(i));
        }
        grupo3vuelta(conmebol,40,1,mundial);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("concacaf"))
            concacaf.add(elim.get(i));
        }
        grupo3vuelta(concacaf,40,1,mundial);
        Serie(jpn,kor,40,mundial);
        grilla.clear();
        uefa.clear();
        conmebol.clear();
        concacaf.clear();
        gruposUefa.clear();
        ArrayList<ArrayList<Equipos>> gruposMundial = new ArrayList<>();
        ArrayList<Equipos> segFase= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();
        Resetear(selecciones);
        Funciones.ordenarMundial(mundial, Torneo.sui, Torneo.campeones.get(3));
        grilla=chopped(mundial,4,4);
        gruposMundial=Mezclar(grilla);  
        while(Validacion(gruposMundial,1,3,1)==false){
            gruposMundial=Mezclar(grilla); 
            if(Validacion(gruposMundial,1,3,1)==true)
                break;
        }
        grupo4neu(gruposMundial.get(0),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(1),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(2),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(3),sui.nombre,60,2,segFase);
        segFase.get(0).posicion=1;
        segFase.get(2).posicion=2;
        segFase.get(4).posicion=3;
        segFase.get(6).posicion=4;
        segFase.get(1).posicion=5;
        segFase.get(3).posicion=6;
        segFase.get(5).posicion=7;
        segFase.get(7).posicion=8;
        Collections.sort(segFase,Posiciones());
        octavosSinSorteo(segFase,sui.nombre,60,false,semis);
        octavosSinSorteo(semis,sui.nombre,60,false,fin);
        octavosSinSorteo(fin,sui.nombre,60,false,campeones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        }
        imprimirElo(selecciones);
        
    }
    
    public void m1954sui(){
        ArrayList<Equipos> mundial= new ArrayList<>();
        ArrayList<Equipos> uefa= new ArrayList<>();
        ArrayList<Equipos> conmebol= new ArrayList<>();
        ArrayList<Equipos> concacaf= new ArrayList<>();
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();
        mundial.add(sui);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("uefa"))
            uefa.add(elim.get(i));
        }
        Collections.sort(uefa, rankingElo());
        uefa.remove(sui);
        uefa.add(egy);
        uefa.add(isr);
        grilla=chopped(uefa,11,5,11);
        gruposUefa=Mezclar(grilla);
        grupo3vuelta(gruposUefa.get(0),40,1,mundial);
        grupo3vuelta(gruposUefa.get(1),40,1,mundial);
        grupo3vuelta(gruposUefa.get(2),40,1,mundial);
        grupo3vuelta(gruposUefa.get(3),40,1,mundial);
        grupo3vuelta(gruposUefa.get(4),40,1,mundial);
        Serie(gruposUefa.get(5).get(0),gruposUefa.get(5).get(1),40,mundial);
        Serie(gruposUefa.get(6).get(0),gruposUefa.get(6).get(1),40,mundial);
        Serie(gruposUefa.get(7).get(0),gruposUefa.get(7).get(1),40,mundial);
        Serie(gruposUefa.get(8).get(0),gruposUefa.get(8).get(1),40,mundial);
        Serie(gruposUefa.get(9).get(0),gruposUefa.get(9).get(1),40,mundial);
        Serie(gruposUefa.get(10).get(0),gruposUefa.get(10).get(1),40,mundial);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("conmebol"))
            conmebol.add(elim.get(i));
        }
        grupo4vuelta(conmebol,40,2,mundial);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("concacaf"))
            concacaf.add(elim.get(i));
        }
        grupo3vuelta(concacaf,40,1,mundial);
        Serie(jpn,kor,40,mundial);
        grilla.clear();
        uefa.clear();
        conmebol.clear();
        concacaf.clear();
        gruposUefa.clear();
        ArrayList<ArrayList<Equipos>> gruposMundial = new ArrayList<>();
        ArrayList<Equipos> segFase= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();
        Resetear(selecciones);
        Funciones.ordenarMundial(mundial, Torneo.sui, Torneo.campeones.get(3));
        grilla=chopped(mundial,4,4);
        gruposMundial=Mezclar(grilla);  
        while(Validacion(gruposMundial,1,3,1)==false){
            gruposMundial=Mezclar(grilla); 
            if(Validacion(gruposMundial,1,3,1)==true)
                break;
        }
        grupo4neu(gruposMundial.get(0),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(1),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(2),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(3),sui.nombre,60,2,segFase);
        segFase.get(0).posicion=1;
        segFase.get(2).posicion=2;
        segFase.get(4).posicion=3;
        segFase.get(6).posicion=4;
        segFase.get(1).posicion=5;
        segFase.get(3).posicion=6;
        segFase.get(5).posicion=7;
        segFase.get(7).posicion=8;
        Collections.sort(segFase,Posiciones());
        octavosSinSorteo(segFase,sui.nombre,60,false,semis);
        octavosSinSorteo(semis,sui.nombre,60,false,fin);
        octavosSinSorteo(fin,sui.nombre,60,false,campeones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        }
        imprimirElo(selecciones);
        
    }
    
    
    public void m1954conc(){
        ArrayList<Equipos> mundial= new ArrayList<>();
        ArrayList<Equipos> uefa= new ArrayList<>();
        ArrayList<Equipos> conmebol= new ArrayList<>();
        ArrayList<Equipos> concacaf= new ArrayList<>();
        ArrayList<Equipos> repechaje= new ArrayList<>();
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();
        mundial.add(sui);
        mundial.add(campeones.get(3));
        elim.remove(campeones.get(3));
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("uefa"))
            uefa.add(elim.get(i));
        }
        Collections.sort(uefa, rankingElo());
        uefa.remove(sui);
        uefa.add(egy);
        uefa.add(isr);
        grilla=chopped(uefa,11,5,11);
        gruposUefa=Mezclar(grilla);
        grupo3vuelta(gruposUefa.get(0),40,1,mundial);
        grupo3vuelta(gruposUefa.get(1),40,1,mundial);
        grupo3vuelta(gruposUefa.get(2),40,1,mundial);
        grupo3vuelta(gruposUefa.get(3),40,1,mundial);
        grupo3vuelta(gruposUefa.get(4),40,1,mundial);
        Serie(gruposUefa.get(5).get(0),gruposUefa.get(5).get(1),40,mundial);
        Serie(gruposUefa.get(6).get(0),gruposUefa.get(6).get(1),40,mundial);
        Serie(gruposUefa.get(7).get(0),gruposUefa.get(7).get(1),40,mundial);
        Serie(gruposUefa.get(8).get(0),gruposUefa.get(8).get(1),40,mundial);
        Serie(gruposUefa.get(9).get(0),gruposUefa.get(9).get(1),40,mundial);
        Serie(gruposUefa.get(10).get(0),gruposUefa.get(10).get(1),40,mundial);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("conmebol"))
            conmebol.add(elim.get(i));
        }
        grupo4vuelta(conmebol,40,1,mundial);
        repechaje.add(conmebol.get(1));
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("concacaf"))
            concacaf.add(elim.get(i));
        }
        Serie(concacaf.get(0),concacaf.get(1),40,repechaje);
        Serie(jpn,kor,40,mundial);
        Serie(repechaje.get(0),repechaje.get(1),40,mundial);
        grilla.clear();
        uefa.clear();
        conmebol.clear();
        concacaf.clear();
        gruposUefa.clear();
        ArrayList<ArrayList<Equipos>> gruposMundial = new ArrayList<>();
        ArrayList<Equipos> segFase= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();
        Resetear(selecciones);
        Funciones.ordenarMundial(mundial, Torneo.sui, Torneo.campeones.get(3));
        grilla=chopped(mundial,4,4);
        gruposMundial=Mezclar(grilla);  
        while(Validacion(gruposMundial,1,3,1)==false){
            gruposMundial=Mezclar(grilla); 
            if(Validacion(gruposMundial,1,3,1)==true)
                break;
        }
        grupo4neu(gruposMundial.get(0),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(1),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(2),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(3),sui.nombre,60,2,segFase);
        segFase.get(0).posicion=1;
        segFase.get(2).posicion=2;
        segFase.get(4).posicion=3;
        segFase.get(6).posicion=4;
        segFase.get(1).posicion=5;
        segFase.get(3).posicion=6;
        segFase.get(5).posicion=7;
        segFase.get(7).posicion=8;
        Collections.sort(segFase,Posiciones());
        octavosSinSorteo(segFase,sui.nombre,60,false,semis);
        octavosSinSorteo(semis,sui.nombre,60,false,fin);
        octavosSinSorteo(fin,sui.nombre,60,false,campeones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        }
        imprimirElo(selecciones);
        
        
    }
    
    public void m1954uefa(){
        ArrayList<Equipos> mundial= new ArrayList<>();
        ArrayList<Equipos> uefa= new ArrayList<>();
        ArrayList<Equipos> conmebol= new ArrayList<>();
        ArrayList<Equipos> concacaf= new ArrayList<>();
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();
        mundial.add(sui);
        mundial.add(campeones.get(3));
        elim.remove(campeones.get(3));
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("uefa"))
            uefa.add(elim.get(i));
        }
        Collections.sort(uefa, rankingElo());
        uefa.remove(sui);
        uefa.add(egy);
        if(!campeones.get(3).equals(isr))
        uefa.add(isr);
        grilla=chopped(uefa,10,6,10);
        gruposUefa=Mezclar(grilla);
        grupo3vuelta(gruposUefa.get(0),40,1,mundial);
        grupo3vuelta(gruposUefa.get(1),40,1,mundial);
        grupo3vuelta(gruposUefa.get(2),40,1,mundial);
        grupo3vuelta(gruposUefa.get(3),40,1,mundial);
        grupo3vuelta(gruposUefa.get(4),40,1,mundial);
        grupo3vuelta(gruposUefa.get(5),40,1,mundial);
        Serie(gruposUefa.get(6).get(0),gruposUefa.get(6).get(1),40,mundial);
        Serie(gruposUefa.get(7).get(0),gruposUefa.get(7).get(1),40,mundial);
        Serie(gruposUefa.get(8).get(0),gruposUefa.get(8).get(1),40,mundial);
        Serie(gruposUefa.get(9).get(0),gruposUefa.get(9).get(1),40,mundial);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("conmebol"))
            conmebol.add(elim.get(i));
        }
        grupo4vuelta(conmebol,40,2,mundial);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("concacaf"))
            concacaf.add(elim.get(i));
        }
        grupo3vuelta(concacaf,40,1,mundial);
        Serie(jpn,kor,40,mundial);
        grilla.clear();
        uefa.clear();
        conmebol.clear();
        concacaf.clear();
        gruposUefa.clear();
        ArrayList<ArrayList<Equipos>> gruposMundial = new ArrayList<>();
        ArrayList<Equipos> segFase= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();
        Resetear(selecciones);
        Funciones.ordenarMundial(mundial, Torneo.sui, Torneo.campeones.get(3));
        grilla=chopped(mundial,4,4);
        gruposMundial=Mezclar(grilla);  
        while(Validacion(gruposMundial,1,3,1)==false){
            gruposMundial=Mezclar(grilla); 
            if(Validacion(gruposMundial,1,3,1)==true)
                break;
        }
        grupo4neu(gruposMundial.get(0),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(1),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(2),sui.nombre,60,2,segFase);
        grupo4neu(gruposMundial.get(3),sui.nombre,60,2,segFase);
        segFase.get(0).posicion=1;
        segFase.get(2).posicion=2;
        segFase.get(4).posicion=3;
        segFase.get(6).posicion=4;
        segFase.get(1).posicion=5;
        segFase.get(3).posicion=6;
        segFase.get(5).posicion=7;
        segFase.get(7).posicion=8;
        Collections.sort(segFase,Posiciones());
        octavosSinSorteo(segFase,sui.nombre,60,false,semis);
        octavosSinSorteo(semis,sui.nombre,60,false,fin);
        octavosSinSorteo(fin,sui.nombre,60,false,campeones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        }
        imprimirElo(selecciones);
        
    }
    
    
    public void m1950(){
        selecciones.remove(est);
        selecciones.remove(lva);
        selecciones.remove(ltu);
        Resetear(selecciones);
        isr.nombre="ISRAEL        ";
        isr.nivel=5;
        irl.nivel=4;
        fin.nivel=5;
        por.nivel=4;
        usa.nivel=4;   
        selecciones.add(eng);
        selecciones.add(sco);
        selecciones.add(wal);
        selecciones.add(nir);
        for(int i=0;i<selecciones.size();i++)
        elim.add(selecciones.get(i));
        elim.remove(aut);
        elim.remove(cze);
        elim.remove(Arg);
        elim.remove(hun);
        elim.remove(ger);
        elim.remove(nor);
        elim.remove(pol);
        elim.remove(bel);
        elim.remove(rou);
        elim.remove(ned);
        elim.remove(egy);
        elim.remove(bul);
        elim.remove(hai);
        elim.remove(gre);
        if(campeones.get(2).conf.equals("uefa")&&elim.contains(campeones.get(2))){
            m1950uefa();
        }else if(campeones.get(2).equals(cub)){
            m1950conc();
        }else{
            m1950bra();
        }
        Grupos.clasificacion(Torneo.bra.nombre, Torneo.campeones.get(3), 15);
        
        
    }
    
    public void m1950uefa(){
        ArrayList<Equipos> mundial= new ArrayList<>();
        ArrayList<Equipos> uefa= new ArrayList<>();
        ArrayList<Equipos> concacaf= new ArrayList<>();
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();
        mundial.add(bra);
        mundial.add(campeones.get(2));
        mundial.add(uru);
        mundial.add(par);
        mundial.add(chi);
        mundial.add(bol);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("uefa")){
                uefa.add(elim.get(i));
            }
        }
        uefa.remove(campeones.get(2));        
        Collections.sort(uefa,rankingElo());
        uefa.add(isr);
        grilla=chopped(uefa,5,2);
        gruposUefa=Mezclar(grilla);
        grupo3vuelta(gruposUefa.get(0),40,1,mundial);
        grupo3vuelta(gruposUefa.get(1),40,1,mundial);
        grupo3vuelta(gruposUefa.get(2),40,1,mundial);
        grupo3vuelta(gruposUefa.get(3),40,1,mundial);
        Serie(gruposUefa.get(4).get(0),gruposUefa.get(4).get(1),40,mundial);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("concacaf")){
                concacaf.add(elim.get(i));
            }
        }
        grupo3vuelta(concacaf,40,2,mundial);
        uefa.clear();
        concacaf.clear();
        grilla.clear();
        gruposUefa.clear();
        ArrayList<ArrayList<Equipos>> gruposMundial = new ArrayList<>();
        ArrayList<Equipos> segFase= new ArrayList<>();
        Resetear(selecciones);
        imprimirElo(mundial);
        Funciones.ordenarMundial(mundial, Torneo.bra, Torneo.campeones.get(2));                
        grilla=chopped(mundial,4,4,1,4);
        gruposMundial=Mezclar(grilla);  
        while(Validacion(gruposMundial,2,2,1)==false){
            gruposMundial=Mezclar(grilla); 
            if(Validacion(gruposMundial,2,2,1)==true)
                break;
        }
        grupo4neu(gruposMundial.get(0),bra.nombre,60,1,segFase);
        grupo3neu(gruposMundial.get(1),bra.nombre,60,1,segFase);
        grupo3neu(gruposMundial.get(2),bra.nombre,60,1,segFase);
        grupo3neu(gruposMundial.get(3),bra.nombre,60,1,segFase);
        Resetear(selecciones);
        grupo4neu(segFase,bra.nombre,60,1,campeones);
        imprimirElo(selecciones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        } 
    
    }
    
    
    public void m1950conc(){
        ArrayList<Equipos> mundial= new ArrayList<>();
        ArrayList<Equipos> uefa= new ArrayList<>();
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();
        mundial.add(bra);
        mundial.add(campeones.get(2));
        mundial.add(uru);
        mundial.add(par);
        mundial.add(chi);
        mundial.add(bol);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("uefa")){
                uefa.add(elim.get(i));
            }
        }
        Collections.sort(uefa,rankingElo());
        uefa.add(isr);
        grilla=chopped(uefa,6,3,6);
        gruposUefa=Mezclar(grilla);
        grupo3vuelta(gruposUefa.get(0),40,1,mundial);
        grupo3vuelta(gruposUefa.get(1),40,1,mundial);
        grupo3vuelta(gruposUefa.get(2),40,1,mundial);
        Serie(gruposUefa.get(3).get(0),gruposUefa.get(3).get(1),40,mundial);
        Serie(gruposUefa.get(4).get(0),gruposUefa.get(4).get(1),40,mundial);
        Serie(gruposUefa.get(5).get(0),gruposUefa.get(5).get(1),40,mundial);
        Serie(mex,usa,40,mundial);
        uefa.clear();
        grilla.clear();
        gruposUefa.clear();
        ArrayList<ArrayList<Equipos>> gruposMundial = new ArrayList<>();
        ArrayList<Equipos> segFase= new ArrayList<>();
        Resetear(selecciones);
        imprimirElo(mundial);
        Funciones.ordenarMundial(mundial, Torneo.bra, Torneo.campeones.get(2));                
        grilla=chopped(mundial,4,4,1,4);
        gruposMundial=Mezclar(grilla); 
        while(Validacion(gruposMundial,2,2,1)==false){
            gruposMundial=Mezclar(grilla); 
            if(Validacion(gruposMundial,2,2,1)==true)
                break;
        }
        grupo4neu(gruposMundial.get(0),bra.nombre,60,1,segFase);
        grupo3neu(gruposMundial.get(1),bra.nombre,60,1,segFase);
        grupo3neu(gruposMundial.get(2),bra.nombre,60,1,segFase);
        grupo3neu(gruposMundial.get(3),bra.nombre,60,1,segFase);
        Resetear(selecciones);
        grupo4neu(segFase,bra.nombre,60,1,campeones);
        imprimirElo(selecciones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        }
        
    }
    
    public void m1950bra(){
        ArrayList<Equipos> mundial= new ArrayList<>();
        ArrayList<Equipos> uefa= new ArrayList<>();
        ArrayList<Equipos> concacaf= new ArrayList<>();
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();
        mundial.add(bra);
        mundial.add(uru);
        mundial.add(par);
        mundial.add(chi);
        mundial.add(bol);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("uefa")){
                uefa.add(elim.get(i));
            }
        }
        Collections.sort(uefa,rankingElo());
        uefa.add(isr);
        grilla=chopped(uefa,6,3,6);
        gruposUefa=Mezclar(grilla);
        grupo3vuelta(gruposUefa.get(0),40,1,mundial);
        grupo3vuelta(gruposUefa.get(1),40,1,mundial);
        grupo3vuelta(gruposUefa.get(2),40,1,mundial);
        Serie(gruposUefa.get(3).get(0),gruposUefa.get(3).get(1),40,mundial);
        Serie(gruposUefa.get(4).get(0),gruposUefa.get(4).get(1),40,mundial);
        Serie(gruposUefa.get(5).get(0),gruposUefa.get(5).get(1),40,mundial);
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("concacaf")){
                concacaf.add(elim.get(i));
            }
        }
        grupo3vuelta(concacaf,40,2,mundial);
        uefa.clear();
        concacaf.clear();
        grilla.clear();
        gruposUefa.clear();
        ArrayList<ArrayList<Equipos>> gruposMundial = new ArrayList<>();
        ArrayList<Equipos> segFase= new ArrayList<>();
        Resetear(selecciones);
        imprimirElo(mundial);
        Funciones.ordenarMundial(mundial, Torneo.bra, Torneo.campeones.get(2));                
        grilla=chopped(mundial,4,4,1,4);
        gruposMundial=Mezclar(grilla);  
        while(Validacion(gruposMundial,2,2,1)==false){
            gruposMundial=Mezclar(grilla); 
            if(Validacion(gruposMundial,2,2,1)==true)
                break;
        }
        grupo4neu(gruposMundial.get(0),bra.nombre,60,1,segFase);
        grupo3neu(gruposMundial.get(1),bra.nombre,60,1,segFase);
        grupo3neu(gruposMundial.get(2),bra.nombre,60,1,segFase);
        grupo3neu(gruposMundial.get(3),bra.nombre,60,1,segFase);
        Resetear(selecciones);
        grupo4neu(segFase,bra.nombre,60,1,campeones);
        imprimirElo(selecciones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        } 
        
    }
    

    public void m1938(){     
        selecciones.add(nor);
        selecciones.add(lva);
        selecciones.add(fin);
        selecciones.add(ina);
        swe.nivel=2;
        por.nivel=3;
        pol.nivel=2;
        egy.nivel=4;
        gre.nivel=3;
        if(campeones.get(1).conf.equals("uefa")&&!campeones.get(1).nombre.equals(fra.nombre)) {   
        m1938uefa();}else if(campeones.get(1).conf.equals("caf")){
            m1938caf();
        }else{
            m1938fra();
        }
        Grupos.clasificacion(Torneo.fra.nombre, Torneo.campeones.get(2));
    }
    
    public void m1938uefa(){
        
        ArrayList<Equipos> mundial = new ArrayList<>();
        ArrayList<Equipos> uefa=new ArrayList<>(); 
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();        
        Resetear(selecciones);        
        mundial.add(bra);
        mundial.add(ina);
        mundial.add(cub);
        mundial.add(campeones.get(1));
        mundial.add(fra);
        System.out.println(campeones.get(1).nombre);
        for(int i=0;i<selecciones.size();i++){
            if(selecciones.get(i).conf.equals("uefa")&&!selecciones.get(i).nombre.equals(fra.nombre)
                    &&!selecciones.get(i).nombre.equals(campeones.get(1).nombre)){
                uefa.add(selecciones.get(i));
            }
        }          
        imprimirElo(uefa);
        uefa.add(egy);
        uefa.remove(esp);
        grilla=chopped(uefa,6,5,5,6);
        gruposUefa=Mezclar(grilla);      
        for(int i=0;i<gruposUefa.get(3).size();i++){
            System.out.println(gruposUefa.get(4).get(i).nombre);
        }     
        grupo4ida(gruposUefa.get(0),40,2,mundial);
        grupo4ida(gruposUefa.get(1),40,2,mundial);
        grupo4ida(gruposUefa.get(2),40,2,mundial);
        grupo4ida(gruposUefa.get(3),40,2,mundial);
        grupo4ida(gruposUefa.get(4),40,2,mundial);
        Serie(gruposUefa.get(5).get(0),gruposUefa.get(5).get(1),40,mundial);
        imprimirElo(mundial);
        Collections.sort(mundial, rankingElo());
        campeones.get(1).posicion=-1;
        fra.posicion=-1;
        Collections.sort(mundial,Posiciones());        
        uefa.clear();
        grilla.clear();
        gruposUefa.clear();       
        ArrayList<Equipos>cuartos= new ArrayList<>();
        ArrayList<Equipos>semis= new ArrayList<>();
        ArrayList<Equipos>fin= new ArrayList<>();
        grilla=chopped(mundial,8,2);
        octavos(grilla,fra.nombre,60,false,cuartos);
        octavosSinSorteo(cuartos,fra.nombre,60,false,semis);
        octavosSinSorteo(semis,fra.nombre,60,false,fin);
        octavosSinSorteo(fin,fra.nombre,60,false,campeones);
        imprimirElo(selecciones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        } 
        mundial.clear();
        grilla.clear();
        cuartos.clear();
        semis.clear();
        fin.clear();
    }
    
    public void m1938caf(){
        ArrayList<Equipos> mundial = new ArrayList<>();
        ArrayList<Equipos> uefa=new ArrayList<>(); 
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();        
        Resetear(selecciones);        
        mundial.add(bra);
        mundial.add(ina);
        mundial.add(cub);
        mundial.add(campeones.get(1));
        mundial.add(fra);
        for(int i=0;i<selecciones.size();i++){
            if(selecciones.get(i).conf.equals("uefa")&&!selecciones.get(i).nombre.equals(fra.nombre)
                    &&!selecciones.get(i).nombre.equals(campeones.get(1).nombre)){
                uefa.add(selecciones.get(i));
            }
        }
                uefa.remove(esp);
        grilla=chopped(uefa,6,5,5,6);
        gruposUefa=Mezclar(grilla);      
        grupo4ida(gruposUefa.get(0),40,2,mundial);
        grupo4ida(gruposUefa.get(1),40,2,mundial);
        grupo4ida(gruposUefa.get(2),40,2,mundial);
        grupo4ida(gruposUefa.get(3),40,2,mundial);
        grupo4ida(gruposUefa.get(4),40,2,mundial);
        Serie(gruposUefa.get(5).get(0),gruposUefa.get(5).get(1),40,mundial);
        imprimirElo(mundial);
        Collections.sort(mundial, rankingElo());
        campeones.get(1).posicion=-1;
        fra.posicion=-1;
        Collections.sort(mundial,Posiciones());        
        uefa.clear();
        grilla.clear();
        gruposUefa.clear();       
        ArrayList<Equipos>cuartos= new ArrayList<>();
        ArrayList<Equipos>semis= new ArrayList<>();
        ArrayList<Equipos>fin= new ArrayList<>();
        grilla=chopped(mundial,8,2);
        octavos(grilla,fra.nombre,60,false,cuartos);
        octavosSinSorteo(cuartos,fra.nombre,60,false,semis);
        octavosSinSorteo(semis,fra.nombre,60,false,fin);
        octavosSinSorteo(fin,fra.nombre,60,false,campeones);
        imprimirElo(selecciones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        }
        mundial.clear();
        grilla.clear();
        cuartos.clear();
        semis.clear();
        fin.clear();
    }
    
    public void m1938fra(){
        ArrayList<Equipos> mundial = new ArrayList<>();
        ArrayList<Equipos> uefa=new ArrayList<>(); 
        ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
        ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();        
        Resetear(selecciones);        
        mundial.add(bra);
        mundial.add(ina);
        mundial.add(cub);
        mundial.add(fra);
        for(int i=0;i<selecciones.size();i++){
            if(selecciones.get(i).conf.equals("uefa")&&!selecciones.get(i).nombre.equals(fra.nombre)
                    &&!selecciones.get(i).nombre.equals(campeones.get(1).nombre)){
                uefa.add(selecciones.get(i));
            }
        }
        uefa.remove(esp);
        uefa.add(egy);
        grilla=chopped(uefa,6,6,5,6);
        gruposUefa=Mezclar(grilla); 
        grupo4ida(gruposUefa.get(0),40,2,mundial);
        grupo4ida(gruposUefa.get(1),40,2,mundial);
        grupo4ida(gruposUefa.get(2),40,2,mundial);
        grupo4ida(gruposUefa.get(3),40,2,mundial);
        grupo4ida(gruposUefa.get(4),40,2,mundial);
        grupo3ida(gruposUefa.get(5),40,2,mundial);
        Collections.sort(mundial, rankingElo());
        campeones.get(1).posicion=-1;
        fra.posicion=-1;
        Collections.sort(mundial,Posiciones());        
        uefa.clear();
        grilla.clear();
        gruposUefa.clear();       
        ArrayList<Equipos>cuartos= new ArrayList<>();
        ArrayList<Equipos>semis= new ArrayList<>();
        ArrayList<Equipos>fin= new ArrayList<>();
        grilla=chopped(mundial,8,2);
        octavos(grilla,fra.nombre,60,false,cuartos);
        octavosSinSorteo(cuartos,fra.nombre,60,false,semis);
        octavosSinSorteo(semis,fra.nombre,60,false,fin);
        octavosSinSorteo(fin,fra.nombre,60,false,campeones);
        imprimirElo(selecciones);
        for(int i=0;i<campeones.size();i++){
            System.out.println(campeones.get(i).nombre);
        }   
        mundial.clear();
        grilla.clear();
        cuartos.clear();
        semis.clear();
        fin.clear();
    }
    
    
    
    public void m1930(){
     selecciones.add(Arg);
     selecciones.add(fra);
     selecciones.add(mex);
     selecciones.add(chi);
     selecciones.add(srb);
     selecciones.add(bra);
     selecciones.add(bol);
     selecciones.add(rou);
     selecciones.add(per);
     selecciones.add(uru);
     selecciones.add(usa);
     selecciones.add(bel);
     selecciones.add(par);
     ArrayList <Equipos> grupoA = new ArrayList<  > ();
     ArrayList <Equipos> grupoB = new ArrayList<  > ();
     ArrayList <Equipos> grupoC = new ArrayList<  > ();
     ArrayList <Equipos> grupoD = new ArrayList<  > ();  
     ArrayList<ArrayList<Equipos>> grupos = new ArrayList<  > (); 
     Torneo t = new Torneo();
     grupoA.add(Arg);
     grupoA.add(fra);
     grupoA.add(mex);
     grupoA.add(chi);
     grupoB.add(srb);
     grupoB.add(bra);
     grupoB.add(bol);
     grupoC.add(rou);
     grupoC.add(per);
     grupoC.add(uru);
     grupoD.add(usa);
     grupoD.add(bel);
     grupoD.add(par);
     ArrayList <Equipos> nextFase= new ArrayList<  > ();
     t.imprimirElo(selecciones);
     grupos.add(grupoA);
     grupos.add(grupoB);
     grupos.add(grupoC);
     grupos.add(grupoD);
     
     Funciones.faseFinal(grupos, uru.nombre,60,1,nextFase);
     
     nextFase.get(0).posicion=0;
     nextFase.get(1).posicion=2;
     nextFase.get(2).posicion=3;
     nextFase.get(3).posicion=1;     
     Collections.sort(nextFase, Posiciones());
     ArrayList <Equipos> r2= new ArrayList< > ();
     
     octavosSinSorteo(nextFase, uru.nombre,60,false,r2);
     
     octavosSinSorteo(r2, uru.nombre,60,false,Torneo.campeones);
     t.imprimirElo(selecciones);
     
     Grupos.clasificacion(Torneo.uru.nombre, Torneo.campeones.get(0),15);
     
     grupoA.clear();
     grupoB.clear();
     grupoC.clear();
     grupoD.clear();
     nextFase.clear();
     r2.clear();

     
     

     
}       
    
   
    
    public void m1934(){
       
       Torneo t= new Torneo();
       t.Resetear(selecciones);
       bel.nivel=2;
       rou.nivel=2;
       Arg.nivel=2;
       selecciones.add(swe);
       selecciones.add(est);
       selecciones.add(ltu);
       selecciones.add(esp);
       selecciones.add(por);
       selecciones.add(ita);
       selecciones.add(gre);
       selecciones.add(bul);
       selecciones.add(hun);
       selecciones.add(aut);
       selecciones.add(pol);
       selecciones.add(cze);
       selecciones.add(sui);
       selecciones.add(irl);
       selecciones.add(ned);
       selecciones.add(lux);
       selecciones.add(ger);
       selecciones.add(hai);
       selecciones.add(cub);
       selecciones.add(egy);
       selecciones.add(isr);   
       elim1934();
       mundial34.add(bra);
       mundial34.add(Arg);
       
       ArrayList<ArrayList<Equipos>> grilla= new ArrayList<> ();
       ArrayList<Equipos>cuartos= new ArrayList<>();
       ArrayList<Equipos>semis= new ArrayList<>();
       ArrayList<Equipos>fin= new ArrayList<>();
       Collections.sort(mundial34, rankingElo());
       t.imprimirElo(mundial34);
       grilla=chopped(mundial34,8,2);       
       t.octavos(grilla, ita.nombre, 60, false, cuartos);
       t.octavosSinSorteo(cuartos, ita.nombre, 60, false, semis);
       t.octavosSinSorteo(semis, ita.nombre, 60, false, fin);
       t.octavosSinSorteo(fin, ita.nombre, 60, false, campeones);   
       t.imprimirElo(selecciones);
       Grupos.clasificacion(Torneo.ita.nombre, Torneo.campeones.get(1));
       mundial34.clear();
       grilla.clear();
       cuartos.clear();
       semis.clear();
       fin.clear();
       
       
   }
    
    public void elim1934(){
        
        
       ArrayList <Equipos> grupo1= new ArrayList<>();
       ArrayList <Equipos> grupo4= new ArrayList<>();
       ArrayList <Equipos> grupo6= new ArrayList<>();
       ArrayList <Equipos> grupo7= new ArrayList<>();
       ArrayList <Equipos> grupo8= new ArrayList<>();
       
               
       ArrayList <Equipos> r2conc= new ArrayList<>();
       ArrayList <Equipos> finconc= new ArrayList<>();
       
       grupo1.add(swe);
       grupo1.add(est);
       grupo1.add(ltu); 
       grupo4.add(bul);
       grupo4.add(hun);
       grupo4.add(aut);
       grupo6.add(srb);
       grupo6.add(sui);
       grupo6.add(rou);
       grupo7.add(irl);
       grupo7.add(bel);
       grupo7.add(ned);
       grupo8.add(lux);
       grupo8.add(ger);
       grupo8.add(fra);
       tablas.add(grupo1);
       tablas.add(grupo4);
       tablas.add(grupo6);
       tablas.add(grupo7);
       tablas.add(grupo8);
       grupo3ida(grupo1,40,1,Torneo.mundial34);
       Serie(esp,por,40,Torneo.mundial34);
       Serie(ita,gre,40,Torneo.mundial34);
       grupo3vuelta(grupo4,40,2,Torneo.mundial34);
       Serie(cze,pol,40,Torneo.mundial34);
       grupo3ida(grupo6,40,2,Torneo.mundial34);
       grupo3ida(grupo7,40,2,Torneo.mundial34);
       grupo3ida(grupo8,40,2,Torneo.mundial34);
       Serie(hai,cub,40,r2conc);
       Serie(mex,r2conc.get(0),40,finconc);
       ArrayList<Partidos> concacaf= new ArrayList<>();
       concacaf.add(pElimDirecta(usa,finconc.get(0),ita.nombre,40,false,mundial34));
       Serie(isr,egy,40,Torneo.mundial34);
       
        
        
    }
    
    
    public void imprimirElo(ArrayList<Equipos> selecciones){
        Torneo t= new Torneo();
        Collections.sort(selecciones, rankingElo());
        for(int i=0;i<selecciones.size();i++){
           System.out.println((i+1)+". "+selecciones.get(i).nombre+" "+Math.round(selecciones.get(i).elo));
       }
    }
    
    
    public void imprimirNivel(ArrayList<Equipos> selecciones){
        Torneo t= new Torneo();
        Collections.sort(selecciones, rankingElo());
        for(int i=0;i<selecciones.size();i++){
           System.out.println((i+1)+". "+selecciones.get(i).nombre+" "+selecciones.get(i).nivel );
       }
    }
    
    public static Comparator<Equipos> rankingElo(){
       Comparator comp = new Comparator<Equipos>(){
       @Override
     public int compare(Equipos s1, Equipos s2)
     {
         return Double.compare(s2.elo, s1.elo);
     }  
        };
         return comp;
    }   
    
    public static Comparator<Equipos> Posiciones(){
        
       Comparator comp = new Comparator<Equipos>(){
       @Override
     public int compare(Equipos s1, Equipos s2)
     {
         return Integer.compare(s1.posicion, s2.posicion);
     }  
        };
         return comp;
    }  
    
    
   
    
    
     
        
    public int goles1(Equipos equipo1,Equipos rival,String local,int catElo){
        
       
        int golA=0;
        if(!equipo1.conf.equals(rival.conf)){
         if(equipo1.conf.equals("afc")||equipo1.conf.equals("ofc")){
             equipo1.nivel+=2;
         }else if(equipo1.conf.equals("concacaf")||equipo1.conf.equals("caf")){
             equipo1.nivel+=1;
         }
         
         if(rival.conf.equals("afc")||rival.conf.equals("ofc")){
             rival.nivel+=2;
         }else if(rival.conf.equals("concacaf")||rival.conf.equals("caf")){
             rival.nivel+=1;
         }
         
        }
        
        if(!equipo1.nombre.matches(local)&&!rival.nombre.matches(local)){
            if((equipo1.nivel==1)&&(rival.nivel==2)){
                int i= (int)(Math.random()*100+1);
               if(i<=13){
                   golA=0;
               }else if(i<=45){
                   golA=1;                 
               }else if(i<=80){
                   golA=2;                
               }else if(i<=91){
                   golA=3;               
               }else if(i<=97){
                   golA=4;                 
               }else if(i<=99){
                   golA=5;               
               }else{
                   golA=6; 
               }
            }
            else if((equipo1.nivel==2)&&(rival.nivel==1)){
                int i= (int)(Math.random()*100+1);
               if(i<=46){
                   golA=0;
               }else if(i<=89){
                   golA=1;                 
               }else if(i<=96){
                   golA=2;                
               }else if(i<=99){
                   golA=3;               
               }else{
                   golA=4;
               }
            }
            
           else if((equipo1.nivel==rival.nivel)||(equipo1.nivel>=6&&rival.nivel>=6)){
               int i= (int)(Math.random()*100+1);
               if(i<=31){
                   golA=0;
               }else if(i<=66){
                   golA=1;                 
               }else if(i<=91){
                   golA=2;                
               }else if(i<=96){
                   golA=3;               
               }else if(i<=99){
                   golA=4;                 
               }else{
                   golA=5;               
               }                                              
           }
           else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel)==1){
               int i=(int)(Math.random()*100+1);
               if(i<=15){
                   golA=0;                  
               }else if(i<=48){
                   golA=1;               
               }else if(i<=80){
                   golA=2;                    
               }else if(i<=91){
                   golA=3; 
               }else if(i<=97){
                   golA=4;  
               }else if(i<=99){
                   golA=5;
               }else{
                   golA=6; 
               }
           }
           else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel)==2){               
               int i=(int)(Math.random()*100+1);             
               if(i<=8){
                   golA=0;
               }else if(i<=36){
                   golA=1;
               }else if(i<=63){
                   golA=2;
               }else if(i<=83){
                   golA=3;
               }else if(i<=93){
                   golA=4;
               }else if(i<=96){
                   golA=5;
               }else if(i<=99){
                   golA=6;
               }else{
                   golA=7;
               }
           }
           else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel)==3)||((rival.nivel>=6&&equipo1.nivel==5))
                   ||((rival.nivel>=6&&equipo1.nivel>=6)&&(rival.nivel-equipo1.nivel>=1))){
               int i=(int)(Math.random()*100+1);               
               if(i<=2){
                   golA=0;                   
               }else if(i<=14){
                   golA=1;
               }else if(i<=42){
                   golA=2;
               }else if(i<=70){
                   golA=3;
               }else if(i<=88){
                   golA=4;
               }else if(i<=96){
                   golA=5;
               }else if(i<=98){
                   golA=6;
               }else if(i<=99){
                   golA=7;
               }else{
                   golA=8;
               }
           }else if((equipo1.nivel<5&&rival.nivel>=6)||((rival.nivel-equipo1.nivel)==4)&&equipo1.nivel<5){
               int i=(int)(Math.random()*100+1);
               if(i<=2){
                   golA=0;
               }else if(i<=5){
                   golA=1;
               }else if(i<=13){
                   golA=2;
               }else if(i<=26){
                   golA=3;
               }else if(i<=44){
                   golA=4;
               }else if(i<=66){
                   golA=5;
               }else if(i<=79){
                   golA=6;
               }else if(i<=87){
                   golA=7;
               }else if(i<=93){
                   golA=8;
               }else if(i<=97){
                   golA=9;
               }else{
                   golA=10;
               }
           }
           else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel)==-1){
               int i=(int)(Math.random()*100+1);
               if(i<=45){
                   golA=0;
               }else if(i<=87){
                   golA=1;                   
               }else if(i<=95){
                   golA=2;
               }else if(i<=99){
                   golA=3;
               }else{
                   golA=4;
               }
           }else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel)==-2){
               int i=(int)(Math.random()*100+1);
               if(i<=54){
                   golA=0;
               }else if(i<=91){
                   golA=1;
               }else if(i<=98){
                   golA=2;
               }else{
                   golA=3;
               }
           }else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel)==-3)||((equipo1.nivel>=6&&rival.nivel==5))
                   ||((rival.nivel>=6&&equipo1.nivel>=6)&&(rival.nivel-equipo1.nivel>=-1))){
               int i=(int)(Math.random()*100+1);               
               if(i<=67){
                   golA=0;
               }else if(i<=96){
                   golA=1;
               }else{
                   golA=2;
               }               
           }else if((rival.nivel<5&&equipo1.nivel>=6)||((rival.nivel-equipo1.nivel)==-4)&&rival.nivel<5){
               int i=(int)(Math.random()*100+1);
               if(i<=87){
                   golA=0;
               }else{
                   golA=1;                   
               }
           }  
        }
        else{
           if(equipo1.nombre.matches(local)){
               if(equipo1.nivel==1&&rival.nivel==2){ 
                  int i=(int)(Math.random()*100+1);
                  if(i<=13){
                      golA=0;
                  }else if(i<=43){
                      golA=1;                   
                  }else if(i<=78){
                      golA=2;
                  }else if(i<=89){
                      golA=3;
                  }else if(i<=96){
                      golA=4;
                  }else if(i<=98){
                      golA=5;
                  }else if(i<=99){
                      golA=6;
                  }else{
                      golA=7;
                  }
               }
               else if(equipo1.nivel==2&&rival.nivel==1){  
                  int i=(int)(Math.random()*100+1);
                  if(i<=45){
                      golA=0;
                  }else if(i<=82){
                      golA=1;                   
                  }else if(i<=95){
                      golA=2;
                  }else if(i<=99){
                      golA=3;
                  }else{
                      golA=4;
                  }
               }else if(equipo1.nivel==rival.nivel){ 
                   int i=(int)(Math.random()*100+1);
                   if(i<=29){
                       golA=0;
                   }else if(i<=64){
                       golA=1;
                   }else if(i<=90){
                       golA=2;
                   }else if(i<=95){
                       golA=3;
                   }else if(i<=98){
                       golA=4;
                   }else if(i<=99){
                       golA=5;
                   }else{
                       golA=6;
                   }
               }else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==1)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=13){
                       golA=0;
                   }else if(i<=43){
                       golA=1;
                   }else if(i<=78){
                       golA=2;
                   }else if(i<=89){
                       golA=3;
                   }else if(i<=96){
                       golA=4;
                   }else if(i<=98){
                       golA=5;
                   }else if(i<=99){
                       golA=6;
                   }else{
                       golA=7;
                   }
               }else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==2)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=7){
                       golA=0;
                   }else if(i<=34){
                       golA=1;
                   }else if(i<=61){
                       golA=2;
                   }else if(i<=81){
                       golA=3;
                   }else if(i<=92){
                       golA=4;
                   }else if(i<=96){
                       golA=5;
                   }else if(i<=98){
                       golA=6;
                   }else if(i<=99){
                       golA=7;
                   }else{
                       golA=8;
                   }
               }else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==3))||(equipo1.nivel==5&&rival.nivel>=6)
                       ||((rival.nivel>=6&&equipo1.nivel>=6)&&(rival.nivel-equipo1.nivel>=1))){
                   int i=(int)(Math.random()*100+1);                  
                   if(i<=2){
                       golA=0;
                   }else if(i<=13){
                       golA=1;
                   }else if(i<=39){
                       golA=2;
                   }else if(i<=68){
                       golA=3;
                   }else if(i<=87){
                       golA=4;
                   }else if(i<=95){
                       golA=5;
                   }else if(i<=98){
                       golA=6;
                   }else if(i<=99){
                       golA=7;
                   }else{
                       golA=8;
                   }                   
               }else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==4))||(equipo1.nivel<5&&rival.nivel>=6)){
                   int i= (int)(Math.random()*100+1);
                   if(i<=2){
                       golA=0;
                   }else if(i<=5){
                       golA=1;
                   }else if(i<=13){
                       golA=2;
                   }else if(i<=26){
                       golA=3;
                   }else if(i<=44){
                       golA=4;
                   }else if(i<=66){
                       golA=5;
                   }else if(i<=79){
                       golA=6;
                   }else if(i<=87){
                       golA=7;
                   }else if(i<=93){
                       golA=8;
                   }else if(i<=97){
                       golA=9;
                   }else{
                       golA=10;
                   }
               }else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==-1)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=39){
                       golA=0;
                   }else if(i<=74){
                       golA=1;
                   }else if(i<=94){
                       golA=2;
                   }else if(i<=99){
                       golA=3;
                   }else{
                       golA=4;
                   }                   
               }else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==-2)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=51){
                       golA=0;
                   }else if(i<=90){
                       golA=1;
                   }else if(i<=97){
                       golA=2;
                   }else{
                       golA=3;
                   }
               }else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==-3))||(equipo1.nivel>=6&&rival.nivel==5)
                       ||((rival.nivel>=6&&equipo1.nivel>=6)&&(rival.nivel-equipo1.nivel>=-1))){
                   int i=(int)(Math.random()*100+1);                   
                   if(i<=62){
                       golA=0;
                   }else if(i<=92){
                       golA=1;
                   }else if(i<=99){
                       golA=2;
                   }else{
                       golA=3;
                   }
               }else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==-4))||(equipo1.nivel>=6&&rival.nivel<5)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=84){
                       golA=0;
                   }else if(i<=99){
                       golA=1;
                   }else{
                       golA=2;
                   }
               }               
           }           
           else{
               if(equipo1.nivel==1&&rival.nivel==2){
                   int i=(int)(Math.random()*100+1);
                   if(i<=28){
                       golA=0;
                   }else if(i<=61){
                       golA=1;
                   }else if(i<=88){
                       golA=2;
                   }else if(i<=95){
                       golA=3;
                   }else if(i<=99){
                       golA=4;
                   }else{
                       golA=5;
                   }
               }else if(equipo1.nivel==2&&rival.nivel==1){
                   int i=(int)(Math.random()*100+1);
                   if(i<=50){
                       golA=0;
                   }else if(i<=91){
                       golA=1;
                   }else if(i<=97){
                       golA=2;
                   }else{
                       golA=3;
                   }
               }else if(equipo1.nivel==rival.nivel){
                   int i=(int)(Math.random()*100+1);
                   if(i<=39){
                       golA=0;
                   }else if(i<=76){
                       golA=1;
                   }else if(i<=94){
                       golA=2;
                   }else if(i<=98){
                       golA=3;
                   }else if(i<=99){
                       golA=4;
                   }else{
                       golA=5;
                   }
               }else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==1)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=28){
                       golA=0;
                   }else if(i<=61){
                       golA=1;
                   }else if(i<=88){
                       golA=2;
                   }else if(i<=95){
                       golA=3;
                   }else if(i<=99){
                       golA=4;
                   }else{
                       golA=5;
                   }
               }else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==2)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=15){
                       golA=0;
                   }else if(i<=43){
                       golA=1;
                   }else if(i<=74){
                       golA=2;
                   }else if(i<=89){
                       golA=3;
                   }else if(i<=96){
                       golA=4;
                   }else if(i<=98){
                       golA=5;
                   }else{
                       golA=6;
                   }
               }else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==3))||(equipo1.nivel==5&&rival.nivel>=6)
                       ||((rival.nivel>=6&&equipo1.nivel>=6)&&(rival.nivel-equipo1.nivel>=1))){
                   int i=(int)(Math.random()*100+1);                  
                   if(i<=4){
                       golA=0;
                   }else if(i<=23){
                       golA=1;
                   }else if(i<=56){
                       golA=2;
                   }else if(i<=85){
                       golA=3;
                   }else if(i<=93){
                       golA=4;
                   }else if(i<=97){
                       golA=5;
                   }else if(i<=99){
                       golA=6;
                   }else{
                       golA=7;
                   }
               }else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==4))||(equipo1.nivel<5&&rival.nivel>=6)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=2){
                       golA=0;
                   }else if(i<=10){
                       golA=1;
                   }else if(i<=34){
                       golA=2;
                   }else if(i<=52){
                       golA=3;
                   }else if(i<=70){
                       golA=4;
                   }else if(i<=77){
                       golA=5;
                   }else if(i<=90){
                       golA=6;
                   }else if(i<=95){
                       golA=7;
                   }else if(i<=99){
                       golA=8;
                   }else{
                       golA=9;
                   }
               }else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==-1)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=46){
                       golA=0;
                   }else if(i<=90){
                       golA=1;
                   }else if(i<=96){
                       golA=2;
                   }else if(i<=99){
                       golA=3;
                   }else{
                       golA=4;
                   }
               }else if((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==-2)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=55){
                       golA=0;
                   }else if(i<=92){
                       golA=1;
                   }else if(i<=98){
                       golA=2;
                   }else{
                       golA=3;
                   }
               }else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==-3))||(equipo1.nivel>=6&&rival.nivel==5)
                       ||((rival.nivel>=6&&equipo1.nivel>=6)&&(rival.nivel-equipo1.nivel>=-1))){
                   int i=(int)(Math.random()*100+1);                  
                   if(i<=68){
                       golA=0;
                   }else if(i<=97){
                       golA=1;
                   }else{
                       golA=2;
                   }
               }else if(((equipo1.nivel<6&&rival.nivel<6)&&(rival.nivel-equipo1.nivel==-4))||(equipo1.nivel>=6&&rival.nivel<5)){
                   int i=(int)(Math.random()*100+1);
                   if(i<=87){
                       golA=0;
                   }else{
                       golA=1;
                   }
               }            
           }
        } 
         if(!equipo1.conf.equals(rival.conf)){
         if(equipo1.conf.equals("afc")||equipo1.conf.equals("ofc")){
             equipo1.nivel-=2;
         }else if(equipo1.conf.equals("concacaf")||equipo1.conf.equals("caf")){
             equipo1.nivel-=1;
         }
         
         if(rival.conf.equals("afc")||rival.conf.equals("ofc")){
             rival.nivel-=2;
         }else if(rival.conf.equals("concacaf")||rival.conf.equals("caf")){
             rival.nivel-=1;
         }
         
        } 
       
        return golA;
    }
    
    
    
    public Partidos partido(Equipos equipo1,Equipos equipo2,String local,int catElo,boolean extra,boolean penales){
        Torneo t= new Torneo();
        Partidos p = new Partidos(equipo1,equipo2,goles1(equipo1, equipo2, local, catElo),goles1(equipo2, equipo1, local, catElo),local,catElo,extra,penales);     
        t.Elo(equipo1, equipo2, local, catElo, p);   
          if(p.golesA>p.golesB){
           p.equipo1.pts+=3;
       }else if(p.golesA==p.golesB){
           p.equipo1.pts+=1;
           p.equipo2.pts+=1;
       }else{
           p.equipo2.pts+=3;
       }
       p.equipo1.gf+=p.golesA;
       p.equipo1.gc+=p.golesB;
       p.equipo2.gf+=p.golesB;
       p.equipo2.gc+=p.golesA;
       System.out.println(p.equipo1.nombre+" "+p.golesA+"\n"+p.equipo2.nombre+" "+p.golesB+"\n");  
       todosPartidos.add(p);
       return p;
        
    }
    
    public Partidos pElimDirecta(Equipos equipo1,Equipos equipo2,String local,int catElo,boolean penales,ArrayList<Equipos> siguiente){
        
        
        Torneo t = new Torneo();
        String ganador="";
        String ganadorPen="";
        int i= (int)(Math.random()*100+1);
        if(i<=50){
            Equipos a=equipo1;
            equipo1=equipo2;
            equipo2=a;
        }        
        
        
        
        Partidos p = new Partidos(equipo1,equipo2,goles1(equipo1, equipo2, local, catElo),goles1(equipo2, equipo1, local, catElo),local,catElo,true,penales);
        if(!equipo1.conf.equals(equipo2.conf)){
         if(equipo1.conf.equals("afc")||equipo1.conf.equals("ofc")){
             equipo1.nivel+=2;
         }else if(equipo1.conf.equals("concacaf")||equipo1.conf.equals("caf")){
             equipo1.nivel+=1;
         }
         
         if(equipo2.conf.equals("afc")||equipo2.conf.equals("ofc")){
             equipo2.nivel+=2;
         }else if(equipo2.conf.equals("concacaf")||equipo2.conf.equals("caf")){
             equipo2.nivel+=1;
         }
         
        }
        if(p.golesA==p.golesB){
            if(penales==false){
                if(equipo1.nivel==equipo2.nivel){
                    int j=(int)(Math.random()*100+1);
                    if(j<=50){
                        p.golesA+=1;
                        ganador=equipo1.nombre;
                    }else{
                        p.golesB+=1;
                        ganador=equipo2.nombre;
                    }
                }else if(equipo1.nivel<equipo2.nivel){
                    int j=(int)(Math.random()*100+1);
                    if(j<=90){
                        p.golesA+=1;
                        ganador=equipo1.nombre;
                    }else{
                        p.golesB+=1;
                        ganador=equipo2.nombre;
                    }
                }else if(equipo1.nivel>equipo2.nivel){
                    int j=(int)(Math.random()*100+1);
                    if(j<=90){
                        p.golesB+=1;
                        ganador=equipo2.nombre;
                    }else{
                        p.golesA+=1;
                        ganador=equipo1.nombre;
                }
            }
        }else{
                if(equipo1.nivel==equipo2.nivel){
                    int j=(int)(Math.random()*100+1);
                    if(j<=50){
                        int k=(int)(Math.random()*100+1);
                        if(k<=50){
                            ganadorPen=equipo1.nombre;
                        }else{
                            ganadorPen=equipo2.nombre;
                        }
                    }else{
                        int k=(int)(Math.random()*100+1);
                        if(k<=50){
                            p.golesA+=1;
                            ganador=equipo1.nombre;
                        }else{
                            p.golesB+=1;
                            ganador= equipo2.nombre;
                        }
                    }
                }else if(equipo1.nivel<equipo2.nivel){
                    int j=(int)(Math.random()*100+1);
                    if(j<=30){
                        int k=(int)(Math.random()*100+1);
                        if(k<=85){
                            ganadorPen=equipo1.nombre;
                        }else{
                            ganadorPen=equipo2.nombre;
                        }
                    }else{
                        int k=(int)(Math.random()*100+1);
                        if(k<=90){
                            p.golesA+=1;
                            ganador=equipo1.nombre;
                        }else{
                            p.golesB+=1;
                            ganador=equipo2.nombre;
                        }
                    }
                }else if(equipo1.nivel>equipo2.nivel){
                     int j=(int)(Math.random()*100+1);
                     if(j<=30){
                        int k=(int)(Math.random()*100+1);
                        if(k<=85){
                            ganadorPen=equipo2.nombre;
                        }else{
                            ganadorPen=equipo1.nombre;
                        }
                    }else{
                        int k=(int)(Math.random()*100+1);
                        if(k<=90){
                            p.golesB+=1;
                            ganador=equipo2.nombre;
                        }else{
                            p.golesA+=1;
                            ganador=equipo1.nombre;
                        }
                    }
                }
            }        
    }
        t.Elo(equipo1, equipo2, local, catElo, p); 
        
        if(ganador==""&&ganadorPen==""){
            System.out.println(p.equipo1.nombre+" "+p.golesA+"\n"+p.equipo2.nombre+" "+p.golesB+"\n"); 
            if(p.golesA>p.golesB){
                siguiente.add(equipo1);
            }else{
                siguiente.add(equipo2);
            }  
        }else if(ganador==equipo1.nombre&&ganadorPen==""){
            System.out.println(p.equipo1.nombre+" "+p.golesA+" TS"+"\n"+p.equipo2.nombre+" "+p.golesB+"\n"); 
            siguiente.add(equipo1);
            p.alargue=1;
        }else if(ganador==equipo2.nombre&&ganadorPen==""){
            System.out.println(p.equipo1.nombre+" "+p.golesA+"\n"+p.equipo2.nombre+" "+p.golesB+" TS"+"\n"); 
            siguiente.add(equipo2);
            p.alargue=2;
        }else if(ganadorPen==equipo1.nombre){
            System.out.println(p.equipo1.nombre+" "+p.golesA+" Pen"+"\n"+p.equipo2.nombre+" "+p.golesB+"\n"); 
            siguiente.add(equipo1);
            p.alargue=3;
        }else{
            System.out.println(p.equipo1.nombre+" "+p.golesA+"\n"+p.equipo2.nombre+" "+p.golesB+" Pen"+"\n"); 
            siguiente.add(equipo2);
            p.alargue=4;
        }       
    
        if(!equipo1.conf.equals(equipo2.conf)){
         if(equipo1.conf.equals("afc")||equipo1.conf.equals("ofc")){
             equipo1.nivel-=2;
         }else if(equipo1.conf.equals("concacaf")||equipo1.conf.equals("caf")){
             equipo1.nivel-=1;
         }
         
         if(equipo2.conf.equals("afc")||equipo2.conf.equals("ofc")){
             equipo2.nivel-=2;
         }else if(equipo2.conf.equals("concacaf")||equipo2.conf.equals("caf")){
             equipo2.nivel-=1;
         }
         
        }
        
        todosPartidos.add(p);
        return p;
        
    }    
    
   public double Elo(Equipos equipo1,Equipos rival,String local,int catElo,Partidos p){
    
      
        double w,we,g,dr,newElo;
       if(equipo1.nombre.matches(local)){
           dr=equipo1.elo+100-rival.elo;
       }else if(rival.nombre.matches(local)){
           dr=equipo1.elo-100-rival.elo;
       }else{
           dr=equipo1.elo-rival.elo;
       }
      
       if(p.golesA==p.golesB||(p.golesA-p.golesB==1)||(p.golesA-p.golesB==-1)){
           g=1;
       }else if((p.golesA-p.golesB==2)||(p.golesA-p.golesB==-2)){
           g=1.5;
       }else{
           double difg=Math.abs(p.golesA-p.golesB);
           g=(11+difg)/8;
       }
       
       if(p.golesA==p.golesB){
           w=0.5;
       }else if(p.golesA>p.golesB){
           w=1;
       }else{
           w=0;
       }
      
       we=(1/((Math.pow(10, (-dr/400)))+1));       
       newElo=catElo*g*(w-we);   
       equipo1.elo=equipo1.elo+newElo;
       rival.elo=rival.elo-newElo;      
       return newElo;
} 
   
   static public ArrayList<Partidos> grupo4neu(ArrayList<Equipos> grupo,String local,int catElo,int clasificados,ArrayList<Equipos> siguiente){
       ArrayList<Partidos> p = new ArrayList<> ();
       Torneo t= new Torneo();
       p.add(t.partido(grupo.get(0), grupo.get(1), local,catElo, false, false));
       p.add(t.partido(grupo.get(2), grupo.get(3), local,catElo, false, false));
       p.add(t.partido(grupo.get(0), grupo.get(2), local,catElo, false, false));
       p.add(t.partido(grupo.get(3), grupo.get(1), local,catElo, false, false));
       p.add(t.partido(grupo.get(3), grupo.get(0), local,catElo, false, false));
       p.add(t.partido(grupo.get(1), grupo.get(2), local,catElo, false, false)); 
       Collections.sort(grupo);
       for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
       }
       System.out.println("");
       for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
       }      
       return p;
       
   }
 
   
   static public ArrayList<Partidos> grupo3neu(ArrayList<Equipos> grupo,String local,int catElo,int clasificados,ArrayList<Equipos> siguiente){
       Torneo t = new Torneo();
       ArrayList<Partidos> p = new ArrayList<> ();
       p.add(t.partido(grupo.get(0), grupo.get(1), local, catElo, false, false));
       p.add(t.partido(grupo.get(1), grupo.get(2), local, catElo, false, false));
       p.add(t.partido(grupo.get(2), grupo.get(0), local, catElo, false, false));
       Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
       }
       System.out.println("");
       for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
       }    
       
       return p;
   }
   
   public ArrayList<Partidos> grupo3ida(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
        
       Torneo t= new Torneo();
       ArrayList<Partidos> p= new ArrayList<>();
       p.add(t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre, catElo, false, false));
        p.add(t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre, catElo, false, false));
        p.add(t.partido(grupo.get(2), grupo.get(0), grupo.get(2).nombre, catElo, false, false));
        Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
       }
       System.out.println("");
       for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
       }    
       
       return p;
   }
   
   public ArrayList<Partidos> grupo3vuelta(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
        Torneo t= new Torneo();
       ArrayList<Partidos> p = new ArrayList<>();
        p.add(t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre, catElo, false, false));
        p.add(t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre, catElo, false, false));
        p.add(t.partido(grupo.get(2), grupo.get(0), grupo.get(2).nombre, catElo, false, false));
        p.add(t.partido(grupo.get(1), grupo.get(0), grupo.get(1).nombre, catElo, false, false));
        p.add(t.partido(grupo.get(2), grupo.get(1), grupo.get(2).nombre, catElo, false, false));
        p.add(t.partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre, catElo, false, false));
        Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
        }
        System.out.println("");
        for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
        }    
        return p;
   }
   
   public void grupo4ida(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
        Torneo t= new Torneo();
        t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre, catElo, false, false);
        t.partido(grupo.get(2), grupo.get(3), grupo.get(2).nombre, catElo, false, false);
        t.partido(grupo.get(3), grupo.get(0), grupo.get(3).nombre, catElo, false, false);
        t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre, catElo, false, false);
        t.partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre, catElo, false, false);
        t.partido(grupo.get(1), grupo.get(3), grupo.get(1).nombre, catElo, false, false);
        
        Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
       }
       System.out.println("");
       for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
       }    
   }
   
   public ArrayList<Partidos> grupo4vuelta(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
        
        ArrayList<Partidos> p = new ArrayList<> ();
        p.add(partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre, catElo, false, false));
        p.add(partido(grupo.get(2), grupo.get(3), grupo.get(2).nombre, catElo, false, false));
        p.add(partido(grupo.get(3), grupo.get(0), grupo.get(3).nombre, catElo, false, false));
        p.add(partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre, catElo, false, false));
        p.add(partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre, catElo, false, false));
        p.add(partido(grupo.get(1), grupo.get(3), grupo.get(1).nombre, catElo, false, false));
        p.add(partido(grupo.get(1), grupo.get(0), grupo.get(1).nombre, catElo, false, false));
        p.add(partido(grupo.get(3), grupo.get(2), grupo.get(3).nombre, catElo, false, false));
        p.add(partido(grupo.get(0), grupo.get(3), grupo.get(0).nombre, catElo, false, false));
        p.add(partido(grupo.get(2), grupo.get(1), grupo.get(2).nombre, catElo, false, false));
        p.add(partido(grupo.get(2), grupo.get(0), grupo.get(2).nombre, catElo, false, false));
        p.add(partido(grupo.get(3), grupo.get(1), grupo.get(3).nombre, catElo, false, false));
        
        Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
       }
       System.out.println("");
       for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
       }    
       
       return p;
   }
   
   
   
   public ArrayList<Partidos> Serie(Equipos team1,Equipos team2,int catElo,ArrayList<Equipos> siguiente){
       String ganador="";      
       ArrayList<Partidos> eliminatoria = new ArrayList<>();
       Torneo t = new Torneo();
       
       int i= (int)(Math.random()*100+1);
        if(i<=50){
            Equipos a=team1;
            team1=team2;
            team2=a;
        } 
       Partidos p= new Partidos(team1,team2,t.goles1(team1, team2, team1.nombre, catElo),t.goles1(team2, team1, team1.nombre,
               catElo),team1.nombre,catElo,false,false);
       eliminatoria.add(p);
       System.out.println(p.equipo1.nombre+" "+p.golesA+"\n"+p.equipo2.nombre+" "+p.golesB+"\n");
       Partidos p2=new Partidos(team2,team1,t.goles1(team2, team1, team2.nombre, catElo),t.goles1(team1, team2, team2.nombre,
               catElo),team2.nombre,catElo,false,false);
       eliminatoria.add(p2);
       if(!team1.conf.equals(team2.conf)){
         if(team1.conf.equals("afc")||team1.conf.equals("ofc")){
             team1.nivel+=2;
         }else if(team1.conf.equals("concacaf")||team1.conf.equals("caf")){
             team1.nivel+=1;
         }
         
         if(team2.conf.equals("afc")||team2.conf.equals("ofc")){
             team2.nivel+=2;
         }else if(team2.conf.equals("concacaf")||team2.conf.equals("caf")){
             team2.nivel+=1;
         }
         
        }
       if(p.golesA+p2.golesB>p.golesB+p2.golesA){
           siguiente.add(team1);
       }else if(p.golesA+p2.golesB<p.golesB+p2.golesA){
           siguiente.add(team2);
       }else{
           if(p2.golesB>p.golesB){
               siguiente.add(team1);
           }else if(p.golesB>p2.golesB){
               siguiente.add(team2);
           }else{
               if(team1.nivel==team2.nivel){
                    int j=(int)(Math.random()*100+1);
                    if(j<=50){
                        p2.golesB+=1;
                        ganador=team1.nombre;
                        p2.alargue=2;
                    }else{
                        p2.golesA+=1;
                        ganador=team2.nombre;
                        p2.alargue=1;
                    }
                }else if(team1.nivel<team2.nivel){
                    int j=(int)(Math.random()*100+1);
                    if(j<=90){
                        p2.golesB+=1;
                        ganador=team1.nombre;
                        p2.alargue=2;
                    }else{
                        p2.golesA+=1;
                        ganador=team2.nombre;
                        p2.alargue=1;
                    }
                }else if(team1.nivel>team2.nivel){
                    int j=(int)(Math.random()*100+1);
                    if(j<=90){
                        p2.golesA+=1;
                        ganador=team2.nombre;
                        p2.alargue=1;
                    }else{
                        p2.golesB+=1;
                        ganador=team1.nombre;
                        p2.alargue=2;
                }             
           }          
       }  
           
           
       
   }   
       if(ganador==team1.nombre){
           System.out.println(p2.equipo1.nombre+" "+p2.golesA+"\n"+p2.equipo2.nombre+" "+p2.golesB+" TS"+"\n");
           siguiente.add(team1);
       }else if(ganador==team2.nombre){
           System.out.println(p2.equipo1.nombre+" "+p2.golesA+" TS"+"\n"+p2.equipo2.nombre+" "+p2.golesB+"\n");
           siguiente.add(team2);
       }else{
           System.out.println(p2.equipo1.nombre+" "+p2.golesA+"\n"+p2.equipo2.nombre+" "+p2.golesB+"\n");
       }     
       
       if(!team1.conf.equals(team2.conf)){
         if(team1.conf.equals("afc")||team1.conf.equals("ofc")){
             team1.nivel-=2;
         }else if(team1.conf.equals("concacaf")||team1.conf.equals("caf")){
             team1.nivel-=1;
         }
         
         if(team2.conf.equals("afc")||team2.conf.equals("ofc")){
             team2.nivel-=2;
         }else if(team2.conf.equals("concacaf")||team2.conf.equals("caf")){
             team2.nivel-=1;
         }
         
        }
       
       
       
     t.Elo(team1, team2, team1.nombre, catElo, p); 
     t.Elo(team2, team1, team2.nombre, catElo, p2);
     todosPartidos.add(p);
     todosPartidos.add(p2);
     return eliminatoria;
}
  
   
   public void Resetear(ArrayList<Equipos> lista){
       for(int i=0;i<lista.size();i++){
           lista.get(i).pts=0;
           lista.get(i).gf=0;
           lista.get(i).gc=0;
           lista.get(i).posicion=0;
           
       }
   }
   
   
  static ArrayList<ArrayList<Equipos>> chopped(ArrayList<Equipos> list, final int L,int P) {
    ArrayList<ArrayList<Equipos>> parts = new ArrayList<ArrayList<Equipos>>();
  
     final int N = list.size();
     
        for (int i = 0; i < N; i += L) {
             parts.add(new ArrayList<Equipos>(
            list.subList(i, Math.min(N, i + L)))
             );             
     }
        if(L*P>N){
            parts.add(new ArrayList<Equipos>(
            list.subList(L*P, N))
             ); 
        }
    
    return parts;
}
  
  public ArrayList<Partidos> octavos(ArrayList<ArrayList<Equipos>> lista,String local,int catElo,boolean penales,ArrayList<Equipos>siguiente){
      
      ArrayList<Partidos> llave= new ArrayList<> ();
      Random rndm= new Random();
      Collections.shuffle(lista.get(0),rndm);
      Collections.shuffle(lista.get(1),rndm);
      for(int i=0;i<lista.get(0).size();i++){
          llave.add(pElimDirecta(lista.get(0).get(i), lista.get(1).get(i), local, catElo, false, siguiente));
      }
      
      return llave;
  }
  
  public ArrayList<Partidos> octavosSinSorteo(ArrayList<Equipos> lista,String local,int catElo,boolean penales,ArrayList<Equipos>siguiente){
     
     
      ArrayList<Partidos> llave= new ArrayList<> ();
      
      for(int i=0;i<lista.size();i+=2){
          llave.add(pElimDirecta(lista.get(i), lista.get(i+1), local, catElo, penales, siguiente));
      }
      
      return llave;
  }
  
 
  
  public ArrayList<ArrayList<Equipos>> Mezclar(ArrayList<ArrayList<Equipos>> grilla){
      
     
    
      Random rndm= new Random();
      for(int i=0;i<grilla.size();i++){
          Collections.shuffle(grilla.get(i), rndm);
      } 
    
      ArrayList<ArrayList<Equipos>> grupos = new ArrayList<ArrayList<Equipos>>();    
   
      
      
      int T1= grilla.size();
      int T2=0;
      for(int p=0;p<grilla.size();p++){
          if(grilla.get(p).size()>=T2){
              T2=grilla.get(p).size();
          }        
      }
      
      
      ArrayList<Equipos> lista3 = new ArrayList<>();
      ArrayList<Equipos> list = new ArrayList<>();
      for(int m=0;m<T2;m++){
          for(int n=0;n<T1;n++){
              if(indexArray(grilla,n,m)==true){
                  list.add(grilla.get(n).get(m));
              }
          }
          lista3=(ArrayList<Equipos>)list.clone();
          list.clear();
          grupos.add(lista3);
      }
      
      
      Random rndm2 = new Random();
      for(int k=0;k<grupos.size();k++){
          Collections.shuffle(grupos.get(k),rndm2);
      } 
      
      
      
      return grupos;
  }
   
  
  
  
  public boolean indexArray(ArrayList<ArrayList<Equipos>> arrays,int i,int j){

      
      if(i>=arrays.size()){
          return false;
      }else if(j>=arrays.get(i).size()){
          return false;
      }else{
          return true;
      }  

 
  }
  
  
    static ArrayList<ArrayList<Equipos>> chopped(ArrayList<Equipos> list, int cant1,int cant2,int cant3,int cant4) {
    ArrayList<ArrayList<Equipos>> parts = new ArrayList<>();    
     
       parts.add(new ArrayList<> (list.subList(0, cant1)));
       parts.add(new ArrayList<> (list.subList(cant1, cant1+cant2)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2, cant1+cant2+cant3)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3,cant1+cant2+cant3+cant4)));      
    
    return parts;
}
  
    static ArrayList<ArrayList<Equipos>> chopped(ArrayList<Equipos> list, int cant1,int cant2,int cant3) {
    ArrayList<ArrayList<Equipos>> parts = new ArrayList<>();    
     
       parts.add(new ArrayList<> (list.subList(0, cant1)));
       parts.add(new ArrayList<> (list.subList(cant1, cant1+cant2)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2, cant1+cant2+cant3)));
       
    
    return parts;
}
    
    
    public boolean Validacion(ArrayList<ArrayList<Equipos>> list,int limiteConm,int limiteUefa,int limiteOtros){
       
        
        boolean valido=false;
        boolean validoGlobal=true;
        for(int i=0;i<list.size();i++){
            int sumaConm=0;
            int sumaUefa=0;
            int sumaConc=0;
            int sumaCaf=0;
            int sumaAfc=0;
            int sumaOfc=0;
            
            for(int j=0;j<list.get(i).size();j++){
                if(list.get(i).get(j).conf.equals("conmebol")){
                    sumaConm+=1;
                }else if(list.get(i).get(j).conf.equals("uefa")){
                    sumaUefa+=1;
                }else if(list.get(i).get(j).conf.equals("concacaf")){
                    sumaConc+=1;
                }else if(list.get(i).get(j).conf.equals("caf")){
                    sumaCaf+=1;
                }else if(list.get(i).get(j).conf.equals("afc")){
                    sumaAfc+=1;
                }else{
                    sumaOfc+=1;
                }
                            
            }
             if((sumaUefa<=limiteUefa && sumaConm<=limiteConm && sumaConc<=limiteOtros && sumaCaf<=limiteOtros && sumaAfc<=limiteOtros
                        && sumaOfc<=limiteOtros)&&((limiteUefa-1)<=sumaUefa&&(limiteConm-1)<=sumaConm)){
                    valido=true;
                }else{
                    valido=false;
                } 
             if(valido==false){
                 validoGlobal=false;
             }
        }  
        
        
        return validoGlobal;
    }
    
  
}


