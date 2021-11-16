-- MySQL dump 10.16  Distrib 10.1.26-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: db
-- ------------------------------------------------------
-- Server version	10.1.26-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Saneamento Completo VS2_Plan1`
--

DROP TABLE IF EXISTS `Saneamento Completo VS2_Plan1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Saneamento Completo VS2_Plan1` (
  `Item Antigo` varchar(9) DEFAULT NULL,
  `Descrição Antigo` varchar(130) DEFAULT NULL,
  `Código novo item` decimal(8,1) DEFAULT NULL,
  `Descrição novo item` varchar(137) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Saneamento Completo VS2_Plan1`
--

LOCK TABLES `Saneamento Completo VS2_Plan1` WRITE;
/*!40000 ALTER TABLE `Saneamento Completo VS2_Plan1` DISABLE KEYS */;
INSERT INTO `Saneamento Completo VS2_Plan1` VALUES ('','item novo',1500046.0,'BOMBA PNEUMÁTICA DUPLO EFEITO DIAM 60MM X CURSO 163MM'),('','item novo',1500063.0,'BOMBA CENTRÍFUGA DE 5 ESTÁGIOS PARA GLP CE CS 2 POL MOTOR 15CV 220/380/440V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 350L/MIN'),('1500003.0','BOMBA DE GAS BLACKMER LGF 1 PC 1POL COM MOTOR 1 CV 115V MONO',1500064.0,'BOMBA DE PALHETAS PARA GLP CE CS 1 POL NPT MOTOR 1CV 127V MONOFÁSICO VAZÃO 49,2L/MIN - PIT STOP'),('1500039.0','BOMBA DE GAS BLACKMER LGF 1 PC 1POL COM MOTOR 1 CV 115V TRIFASICO',1500065.0,'BOMBA DE PALHETAS PARA GLP CE CS 1 POL NPT MOTOR 1CV 127V TRIFÁSICO VAZÃO 49,2L/MIN - PIT STOP'),('5600588.0','BOMBA DE GAS BLACKMER LGF 1 PC 1POL COM MOTOR 1 CV 115V TRIFASICO (ESTOQUE)',1500065.0,'BOMBA DE PALHETAS PARA GLP CE CS 1 POL NPT MOTOR 1CV 127V TRIFÁSICO VAZÃO 49,2L/MIN - PIT STOP'),('1600606.0','BOMBA DE GAS BLACKMER 1POL COM MOTOR 1 CV 220V MONO',1500067.0,'BOMBA DE PALHETAS PARA GLP CE CS 1 POL NPT MOTOR 1CV 220V MONOFÁSICO VAZÃO 49,2L/MIN - PIT STOP'),('1500041.0','BOMBA DE GAS BLACKMER LGF 1 PC 1POL COM MOTOR 1 CV 220/380V TRIFASICO',1500068.0,'BOMBA DE PALHETAS PARA GLP CE CS 1 POL NPT MOTOR 1CV 220/380V TRIFÁSICO VAZÃO 49,2L/MIN - PIT STOP'),('1500057.0','BOMBA GLP GLPICCOLO MOD. JP0710 CE CS 1 POL NPT  MOTOR 1 CV 220/380 V TRIFASICO',1500068.0,'BOMBA DE PALHETAS PARA GLP CE CS 1 POL NPT MOTOR 1CV 220/380V TRIFÁSICO VAZÃO 49,2L/MIN - PIT STOP'),('1500024.0','BOMBA BLACKMER 1 1/4 NPT LGL 1.25 MOTOR 3HP 4P 220/380V 60HZ APE',1500069.0,'BOMBA DE PALHETAS PARA GLP CE CS 1.1/4 POL NPT MOTOR 3CV 220/380V TRIFÁSICO VAZÃO 79,5L/MIN'),('1500042.0','BOMBA BLACKMER 1 1/4 POL NPT PARA GLP E NH3 DE PALHETA DESLIZANTES MOD  LGL1.25/ 4 / AR / Q0 / 1 / B / 1 / 0 / 00 / 0 / 0',1500069.0,'BOMBA DE PALHETAS PARA GLP CE CS 1.1/4 POL NPT MOTOR 3CV 220/380V TRIFÁSICO VAZÃO 79,5L/MIN'),('1500002.0','BOMBA DE GAS BLACKMER 2POL P/ GAS LP DV-LGLO2E',1500070.0,'BOMBA DE PALHETAS PARA GLP CE CS 2 POL MOTOR 5 A 7CV 220/380 TRIFÁSICO VAZÃO 189L/MIN'),('1500028.0','BOMBA DE GAS BLACKMER ENT. 4 POL SAIDA 3POL 15 HP',1500071.0,'BOMBA DE PALHETAS PARA GLP CE 4 POL CS 3 POL MOTOR 15CV 220/380V TRIFÁSICO VAZÃO 644L/MIN'),('1500023.0','BOMBA CLIMAX DP GLP LO 1G MOTOR 1CV 4 POLOS AP TRIFASICO PIT STOP',1500072.0,'BOMBA DE PALHETAS  PARA GLP CE CS 1 POL NPT MOTOR 1CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 35L/MIN - PIT STOP'),('1500027.0','BOMBA CLIMAX  MBD 1003 GPL MOTOR 1CV  4POLOS AP TRIFASICA PIT STOP',1500073.0,'BOMBA CENTRÍFUGA DE 3 ESTÁGIOS  PARA GLP CE 1.1/4 POL NPT CS 3/4 POL NPT MOTOR 1CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 25L/MIN'),('1500060.0','BOMBA CLIMAX PARA FEEDBACK MBD 1003 GLP MOTOR 1CV 4 POLOS AP TRIFASICA ENTRADA 1.1/4 SAIDA 3/4 POL',1500073.0,'BOMBA CENTRÍFUGA DE 3 ESTÁGIOS  PARA GLP CE 1.1/4 POL NPT CS 3/4 POL NPT MOTOR 1CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 25L/MIN'),('1500056.0','BOMBA CLIMAX MODELO MBD-1003 GLP 1,5 CV  4 POLOS AP TRIFASICO',1500074.0,'BOMBA CENTRÍFUGA DE 3 ESTÁGIOS  PARA GLP CE 1.1/4 POL NPT CS 3/4 POL NPT MOTOR 1,5CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 30L/MIN'),('1500044.0','BOMBA CLIMAX DA-2003 2C 1 1/4POL GLP 3CV TRIFASICO BLINDADO 220/380/440V  4 POLOS A PROVA DE EXPLOSÃO',1500075.0,'BOMBA CENTRÍFUGA DE 3 ESTÁGIOS  PARA GLP CE CS 1.1/4 POL MOTOR 3CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 50L/MIN'),('1500058.0','BOMBA CLIMAX DA-2013 GLP 3CV TRIFASICO BLINDADO IP55  220/380/440V  4 POLOS A PROVA DE EXPLOSÃO BOCAIS DE ENTRADA E SAIDA 1.1/2',1500076.0,'BOMBA CENTRÍFUGA DE 3 ESTÁGIOS  PARA GLP CE CS 1.1/2 POL MOTOR 3CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 110L/MIN'),('1500059.0','BOMBA CLIMAX GLP 2 ESTAGIO MOTOR ELETRICO 5CV TRIFASICO BLINDADO 4 POLOS 220/380/440 V PROVA DE EXPLOÇÃO BOCAIS ENTRADA E SAIDA 2\"',1500077.0,'BOMBA CENTRÍFUGA DE 2 ESTÁGIOS  PARA GLP CE CS 2 POL MOTOR 5 A 7CV 220/380/440V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 350L/MIN'),('1500001.0','BOMBA DE GAS CENTRIFUGA CLIMAX MOTOR 5CV TRIFASICO',1500077.0,'BOMBA CENTRÍFUGA DE 2 ESTÁGIOS  PARA GLP CE CS 2 POL MOTOR 5 A 7CV 220/380/440V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 350L/MIN'),('1500051.0','BOMBA CLIMAX DA 6003 2POL GLP 7,5 CV TRIFASICO A PROVA DE EXPLOSAO',1500078.0,'BOMBA CENTRÍFUGA DE 3 ESTÁGIOS  PARA GLP CE CS 2 POL MOTOR 7,5CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 350L/MIN'),('1500047.0','BOMBA DE GAS CLIMAX 3 ESTAGIO 7,5 CV A PROVA DE EXPLOSAO',1500078.0,'BOMBA CENTRÍFUGA DE 3 ESTÁGIOS  PARA GLP CE CS 2 POL MOTOR 7,5CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 350L/MIN'),('1500040.0','BOMBA DE GAS CENTRIFUGA CLIMAX MOTOR 10CV TRIFASICO 220/380V 4 ESTAGIOS',1500079.0,'BOMBA CENTRÍFUGA DE 4 ESTÁGIOS  PARA GLP CE CS 2 POL MOTOR 10CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 350L/MIN'),('1500030.0','BOMBA CLIMAX 4POL 10HP',1500080.0,'BOMBA CENTRÍFUGA DE 1 ESTÁGIO PARA GLP CE CS 4 POL MOTOR 10CV 220/380V TRIFÁSICO À PROVA DE EXPLOSÃO VAZÃO 850L/MIN'),('1400004.0','BOMBA DE CIRCULACAO D AGUA CLIMAX MOD.MBD 2011 COM MOTOR 1,5 CV TRIPAZICO',1500081.0,'BOMBA CENTRÍFUGA DE 1 ESTÁGIO PARA ÁGUA CE CS 1 POL BSP MOTOR 1,5CV 220/380V TRIFÁSICO VAZÃO 120L/MIN'),('1400031.0','BOMBA CENTRIFUGA P/ RECIRCULACAO DE AGUA MOD. 10/02 ROWA POT. HP 0,5 RPM VAZAO 4.300LTS A 13.000LTS/H ENTRADA E SAIDA 1 1/2 POL',1500082.0,'BOMBA CENTRÍFUGA DE 1 ESTÁGIO PARA ÁGUA CE CS 1.1/2 POL BSP MOTOR 1CV 127/220V MONOFÁSICO'),('1400030.0','BOMBA CENTRIFUGA P/ RECIRCULACAO DE AGUA MOD. 15/01 ROWA POT. HP 1,25 RPM VAZAO 6.000LTS A 22.000LTS/H ENTRADA E SAIDA 1 1/2 POL',1500082.0,'BOMBA CENTRÍFUGA DE 1 ESTÁGIO PARA ÁGUA CE CS 1.1/2 POL BSP MOTOR 1CV 127/220V MONOFÁSICO'),('1400032.0','BOMBA CENTRIFUGA P/ RECIRCULACAO DE AGUA MOD. GP 230 INOVA POT. 2500 RPM 225W VAZAO 160LTS/M 110ºC TEMP. ENTRADA E SAIDA 11 /2 POL',1500083.0,'BOMBA CENTRÍFUGA DE 1 ESTÁGIO PARA ÁGUA CE CS 1 POL BSP MOTOR 0,5CV 127/220V MONOFÁSICO'),('1500045.0','BOMBA DE RECIRCULAÇÃO DE AGUA 3/4POL MOD KP 260 EQUIBRAS',1500083.0,'BOMBA CENTRÍFUGA DE 1 ESTÁGIO PARA ÁGUA CE CS 1 POL BSP MOTOR 0,5CV 127/220V MONOFÁSICO'),('1500054.0','BOMBA PARA CIRCULAÇÃO DE AGUA 220V RINNAI MOD. RPHT',1500083.0,'BOMBA CENTRÍFUGA DE 1 ESTÁGIO PARA ÁGUA CE CS 1 POL BSP MOTOR 0,5CV 127/220V MONOFÁSICO'),('2900093.0','AQUECEDOR DE PASSAGEM BOSCH MODELO WB 150',2900756.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 8 A 12L/MIN'),('2900094.0','AQUECEDOR DE PASSAGEM BOSCH MODELO WB 200',2900756.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 8 A 12L/MIN'),('2900005.0','AQUECEDOR ORBIS MOD AUTOMAX 12LTS',2900756.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 8 A 12L/MIN'),('2900157.0','AQUECEDOR DE PASSAGEM A GAS RINNAI MOD REU 152 BR',2900757.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 13 A 16L/MIN'),('2900095.0','AQUECEDOR DE PASSAGEM BOSCH MODELO WB 275',2900757.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 13 A 16L/MIN'),('2900098.0','AQUECEDOR DE PASSAGEM BOSCH MODELO WRBX 275',2900757.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 13 A 16L/MIN'),('2900004.0','AQUECEDOR ORBIS MOD AUTOMAX 15LTS',2900757.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 13 A 16L/MIN'),('2900158.0','AQUECEDOR DE AGUA A GAS DE PASSAGEM INSTANTANEO ORBIS MOD AUTOMAX 314BABE CAPAC 18LTS',2900758.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 17 A 20L/MIN'),('2900566.0','AQUECEDOR DE PASSAGEM 20 LITROS',2900758.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 17 A 20L/MIN'),('2900578.0','AQUECEDOR DE PASSAGEM 20 LITROS',2900758.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 17 A 20L/MIN'),('2900543.0','AQUECEDOR DE PASSAGEM A GAS RINNAI REU 181 BR',2900758.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 17 A 20L/MIN'),('2900096.0','AQUECEDOR DE PASSAGEM BOSCH MODELO WB 350',2900758.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 17 A 20L/MIN'),('2900099.0','AQUECEDOR DE PASSAGEM BOSCH MODELO WRBX 350',2900758.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 17 A 20L/MIN'),('2900260.0','AQUECEDOR DE PASSAGEM MOD EB 1800',2900758.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 17 A 20L/MIN'),('2900006.0','AQUECEDOR ORBIS MOD TERMOCENTRAL SEM BOMBA 18LTS',2900758.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 17 A 20L/MIN'),('2900097.0','AQUECEDOR DE PASSAGEM BOSCH MODELO WR 440',2900759.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 21 A 25L/MIN'),('2900100.0','AQUECEDOR DE PASSAGEM BOSCH MODELO WRBX 440',2900759.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 21 A 25L/MIN'),('2900555.0','AQUECEDOR DE PASSAGEM REU-16FEA BE',2900759.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 21 A 25L/MIN'),('2900712.0','AQUECEDOR INOVA IN 2200 - 22 LITROS COM ELIMINADOR DE PILHAS',2900759.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 21 A 25L/MIN'),('2900159.0','AQUECEDOR INSTANTÂNEO DE AGUA DE PASSAGEM A GÁS MOD PH-16 CAPACIDADE 23 LTS 110V',2900759.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 21 A 25L/MIN'),('2900263.0','AQUECEDOR ORBIS AUTOMAX 22 LTS GLP',2900759.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 21 A 25L/MIN'),('2900264.0','AQUECEDOR ORBIS AUTOMAX 22 LTS GN',2900759.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 21 A 25L/MIN'),('2900502.0','AQUECEDOR PARA VAPORIZADOR 22 LTS',2900759.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 21 A 25L/MIN'),('2900631.0','AQUECEDOR DE PASSAGEM INOVA IN 230D 27 LITROS',2900760.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 26 A 30L/MIN'),('2900536.0','AQUECEDOR DE PASSAGEM 32 LTS',2900761.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 31 A 35L/MIN'),('2900503.0','AQUECEDOR DE PASSAGEM A GAS MODELO REU 304 BR',2900761.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 31 A 35L/MIN'),('2900156.0','AQUECEDOR DE PASSAGEM GAS RINNAI REU 302 U BR IN GLP 220V',2900761.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 31 A 35L/MIN'),('2900174.0','AQUECEDOR DE PASSAGEM HARMAM MOD NEO32 A GAS',2900761.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 31 A 35L/MIN'),('2900616.0','AQUECEDOR DE PASSAGEM REU 306 UBR',2900761.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 31 A 35L/MIN'),('2900697.0','AQUECEDOR DE PASSAGEM RINNAI REU 2402 FEC1',2900761.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 31 A 35L/MIN'),('2900012.0','AQUECEDOR RINNAI MOD REU 302 U BR-IN GLP SAP',2900761.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 31 A 35L/MIN'),('2900608.0','AQUECEDOR RINNAI REU 2401',2900761.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 31 A 35L/MIN'),('2900453.0','AQUECEDOR 38,5 L PARA GLP',2900762.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 36 A 40L/MIN'),('2900629.0','AQUECEDOR BOSCH GWH 720 36L/MIN',2900762.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 36 A 40L/MIN'),('2900628.0','AQUECEDOR BOSCH THERM 8000 S 38,5L/MIN',2900762.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 36 A 40L/MIN'),('2900601.0','AQUECEDOR DE PASSAGEM 36 LITROS (REVENDA)',2900762.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 36 A 40L/MIN'),('2900582.0','AQUECEDOR DE PASSAGEM 37 LITROS POTENCIA TERMICA 55.772 KCAL/H',2900762.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 36 A 40L/MIN'),('2900548.0','AQUECEDOR DE PASSAGEM 37 LTS',2900762.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 36 A 40L/MIN'),('2900609.0','AQUECEDOR ORBIS MODELO 230TBD POTENCIA NOMNIAL 30.000 KCAL/H 40 LTS/MIN',2900762.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 36 A 40L/MIN'),('2900207.0','AQUECEDOR HARMAN MOD YS 2450',2900763.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 41 A 45L/MIN'),('2900211.0','AQUECEDOR DE AGUA HYDROTHERM MODELO HT 3000 L/H A GÁS',2900764.0,'AQUECEDOR DE ÁGUA A GÁS DE PASSAGEM 46 A 50L/MIN'),('2900662.0','AQUECEDOR DE FLUIDO TERMICO VERTICAL 400.000 KCAL/H',2900765.0,'AQUECEDOR DE FLUIDO TERMICO VERTICAL 400.000 KCAL/H'),('2900675.0','AQUECEDOR DE AMBIENTE 1000 KCAL/H MOD AK 90',2900766.0,'AQUECEDOR DE AMBIENTE A GÁS 1.000 KCAL/H'),('2900168.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S) DE PETROLEO ELETRICO ALGAZ ZIMMER 40KG/H 100 A 240 V 50 A 60 HZ',2900767.0,'VAPORIZADOR GLP ELETRICO Ex 40KG/H 100/240 V'),('2900455.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO 50 KG/H VCE-50',2900768.0,'VAPORIZADOR GLP ELETRICO 50KG/H X 220V'),('2900057.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH-GAS 50KG/H X 220V',2900768.0,'VAPORIZADOR GLP ELETRICO 50KG/H X 220V'),('2900205.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 50KG/H X 220V',2900768.0,'VAPORIZADOR GLP ELETRICO 50KG/H X 220V'),('2900665.0','VAPORIZADOR GLP GAS ES LIQUEFEITO S DE PETROLEO ELETRICO FLASH-GAS 50KG H X 380V',2900769.0,'VAPORIZADOR GLP ELETRICO 50KG/H X 380V'),('2900235.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 50KG/H X 380V',2900769.0,'VAPORIZADOR GLP ELETRICO 50KG/H X 380V'),('2900137.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S) DE PETROLEO  ELETRICO FLASH-GAS 80KG/H X 220V',2900770.0,'VAPORIZADOR GLP ELETRICO 80KG/H X 220V'),('2900456.0','VAPORIZADOR GLP GAS ES LIQUEFEITO S DE PETROLEO ELETRICO 100 KG H VCE 100',2900771.0,'VAPORIZADOR GLP ELETRICO 100KG/H X 220V'),('2900058.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH-GAS 100KG/H X 220V',2900771.0,'VAPORIZADOR GLP ELETRICO 100KG/H X 220V'),('2900072.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 100KG/H X 220V',2900771.0,'VAPORIZADOR GLP ELETRICO 100KG/H X 220V'),('2900637.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S) DE PETROLEO ELETRICO BRVAPORIZADORES 100 KG/H - EX D II',2900772.0,'VAPORIZADOR GLP ELETRICO Ex 100 KG/H'),('2900059.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH-GAS 100KG/H X 380V',2900773.0,'VAPORIZADOR GLP ELETRICO 100KG/H X 380V'),('2900073.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 100KG/H X 380V',2900773.0,'VAPORIZADOR GLP ELETRICO 100KG/H X 380V'),('2900060.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH GAS 100KG/H X 440V',2900774.0,'VAPORIZADOR GLP ELETRICO 100KG/H X 440V'),('2900074.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 100KG/H X 440V',2900774.0,'VAPORIZADOR GLP ELETRICO 100KG/H X 440V'),('2900457.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO 150 KG/H VCE-150',2900775.0,'VAPORIZADOR GLP ELETRICO 150KG/H X 220V'),('2900061.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH-GAS 160KG/H X 220V',2900775.0,'VAPORIZADOR GLP ELETRICO 150KG/H X 220V'),('2900075.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 150KG/H X 220V',2900775.0,'VAPORIZADOR GLP ELETRICO 150KG/H X 220V'),('2900062.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH-GAS 160KG/H X 380V',2900776.0,'VAPORIZADOR GLP ELETRICO 150KG/H X 380V'),('2900076.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 150KG/H X 380V',2900776.0,'VAPORIZADOR GLP ELETRICO 150KG/H X 380V'),('2900063.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S) DE PETROLEO  ELETRICO FLASH-GAS 160KG/H X 440V',2900777.0,'VAPORIZADOR GLP ELETRICO 150KG/H X 440V'),('2900077.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 150KG/H X 440V',2900777.0,'VAPORIZADOR GLP ELETRICO 150KG/H X 440V'),('2900458.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO 200 KG/H VCE-200',2900778.0,'VAPORIZADOR GLP ELETRICO 200KG/H X 220V'),('2900591.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH GAS 200KG/H X 220V',2900778.0,'VAPORIZADOR GLP ELETRICO 200KG/H X 220V'),('2900592.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH GAS 200KG/H X 380V',2900779.0,'VAPORIZADOR GLP ELETRICO 200KG/H X 380V'),('2900593.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH GAS 200KG/H X 440V',2900780.0,'VAPORIZADOR GLP ELETRICO 200KG/H X 440V'),('2900459.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO 250 KG/H VCE-250',2900781.0,'VAPORIZADOR GLP ELETRICO 250KG/H X 220V'),('2900064.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH GAS 240KG/H X 220V',2900781.0,'VAPORIZADOR GLP ELETRICO 250KG/H X 220V'),('2900078.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 250KG/H X 220V',2900781.0,'VAPORIZADOR GLP ELETRICO 250KG/H X 220V'),('2900065.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S)  DE PETROLEO ELETRICO FLASH-GAS 240KG/H X 380V',2900782.0,'VAPORIZADOR GLP ELETRICO 250KG/H X 380V'),('2900079.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO SENAS 250KG/H X 380V',2900782.0,'VAPORIZADOR GLP ELETRICO 250KG/H X 380V'),('2900080.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO 250KG/H X 440V',2900783.0,'VAPORIZADOR GLP ELETRICO 250KG/H X 440V'),('2900066.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH GAS 240KG H X 440V',2900783.0,'VAPORIZADOR GLP ELETRICO 250KG/H X 440V'),('2900460.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO 300 KG/H VCE-300',2900784.0,'VAPORIZADOR GLP ELETRICO 300KG/H X 220V'),('2900067.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH-GAS 320KG/H X 220V',2900784.0,'VAPORIZADOR GLP ELETRICO 300KG/H X 220V'),('2900068.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S) DE PETROLEO  ELETRICO FLASH-GAS 320KG/H X 380V',2900785.0,'VAPORIZADOR GLP ELETRICO 300KG/H X 380V'),('2900461.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO  400 KG/H VCE-400',2900786.0,'VAPORIZADOR GLP ELETRICO 400KG/H X 220V'),('','item novo',2900787.0,'VAPORIZADOR GLP ELETRICO 400KG/H X 380V'),('2900663.0','VAPORIZADOR ELETRICO VERTICAL FEED-OUT 500 KG/H',2900788.0,'VAPORIZADOR GLP ELETRICO 500KG/H X 220V'),('2900462.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO 500 KG/H VCE-500',2900788.0,'VAPORIZADOR GLP ELETRICO 500KG/H X 220V'),('2900069.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH GAS 500KG H X 220V',2900788.0,'VAPORIZADOR GLP ELETRICO 500KG/H X 220V'),('2900070.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH-GAS 500KG/H X 380V',2900789.0,'VAPORIZADOR GLP ELETRICO 500KG/H X 380V'),('2900092.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH-GAS 500 KG/H X 440V',2900790.0,'VAPORIZADOR GLP ELETRICO 500KG/H X 440V'),('2900647.0','VAPORIZADORES DE 750 KG/H 380V ELETRICO FEED OUT',2900791.0,'VAPORIZADOR GLP ELETRICO 750KG/H X 380V'),('2900651.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO ELETRICO FLASH-GAS 750 KG/H X 440V',2900792.0,'VAPORIZADOR GLP ELETRICO 750KG/H X 440V'),('2900627.0','VAPORIZADOR GLP (ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 50KG/H HYDROSYS-50',2900793.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 50KG/H'),('2900040.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 50KG/H',2900793.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 50KG/H'),('2900463.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 50 KG/H VCA-50',2900793.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 50KG/H'),('2900449.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 100KG/H HYDROSYS-100',2900794.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 100KG/H'),('2900486.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 100 KG/H HYDROVAP-100',2900794.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 100KG/H'),('2900481.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 100 KG/H SENAS',2900794.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 100KG/H'),('2900464.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 100 KG/H VCA-100',2900794.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 100KG/H'),('2900041.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S)DE PETROLEO A AGUA QUENTE 100KG/H',2900794.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 100KG/H'),('2900106.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 150 KG HJ',2900795.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 150KG/H'),('2900136.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 160KG/H',2900795.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 150KG/H'),('2900482.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 150 KG/H SENAS',2900795.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 150KG/H'),('2900465.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 150 KG/H VCA-150',2900795.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 150KG/H'),('2900450.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 200KG/H HYDROSYS-200',2900796.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 200KG/H'),('2900487.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 200 KG/H HYDROVAP-200',2900796.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 200KG/H'),('2900466.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 200 KG/H VCA-200',2900796.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 200KG/H'),('2900042.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S)DE PETROLEO A AGUA QUENTE 200KG/H',2900796.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 200KG/H'),('2900483.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 250 KG/H SENAS',2900797.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 250KG/H'),('2900467.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 250 KG/H VCA-250',2900797.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 250KG/H'),('2900597.0','VAPORIZADOR FEED-OUT AGUA QUENTE HYDROVAP 300',2900798.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 300KG/H'),('2900043.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 300KG/H',2900798.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 300KG/H'),('2900451.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 300KG/H HYDROSYS-300',2900798.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 300KG/H'),('2900488.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 300 KG/H HYDROVAP300',2900798.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 300KG/H'),('2900484.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 300 KG/H SENAS',2900798.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 300KG/H'),('2900468.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 300 KG/H VCA-300',2900798.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 300KG/H'),('2900485.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 400 KG/H SENAS',2900799.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 400KG/H'),('2900469.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 400 KG/H VCA-400',2900799.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 400KG/H'),('2900044.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 500KG/H',2900800.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 500KG/H'),('2900489.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 500 KG/H HYDROVAP-500',2900800.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 500KG/H'),('2900470.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 500 KG/H VCA-500',2900800.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 500KG/H'),('2900045.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S) DE PETROLEO  A AGUA QUENTE 750KG/H',2900801.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 750KG/H'),('2900490.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 750 KG/H HYDROVAP-750',2900801.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 750KG/H'),('2900471.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 750 KG/H VCA-750',2900801.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 750KG/H'),('','item novo',2900802.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 850KG/H'),('2900085.0','VAPORIZADOR FEED-OUT AGUA QUENTE HYDROVAP 1000',2900803.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 1.000KG/H'),('2900046.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 1000KG/H',2900803.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 1.000KG/H'),('2900632.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 1000KG/H  HYDROSYS-1000',2900803.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 1.000KG/H'),('2900491.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 1000 KG/H HYDROVAP-1000',2900803.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 1.000KG/H'),('2900668.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 1000 KG/H VCA-1000',2900803.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 1.000KG/H'),('2900047.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 1500 KG H',2900804.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 1.500KG/H'),('2900492.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 1500 KG/H HYDROVAP-1500',2900804.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 1.500KG/H'),('2900217.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S) DE PETROLEO A AGUA QUENTE 2500KG/H',2900805.0,'VAPORIZADOR GLP AGUA QUENTE COM CIRCULACAO 2.500KG/H'),('2900473.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE300 KG/H VBM-300',2900806.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 300KG/H'),('2900474.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 500 KG/H VBM-500',2900807.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 500KG/H'),('2900475.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 750 KG/H VBM-750',2900808.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 750KG/H'),('2900476.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE1000 KG/H VBM-1000',2900809.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 1.000KG/H'),('2900477.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 1500 KG/H VBM-1500',2900810.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 1.500KG/H'),('2900478.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 2000 KG/H VBM-2000',2900811.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 2.000KG/H'),('2900213.0','VAPORIZADOR A AGUA QUENTE 3000 KG/H GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO  VBM TEC',2900812.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 3.000KG/H'),('2900479.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 3000 KG/H VBM-3000',2900812.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 3.000KG/H'),('2900216.0','VAPORIZADOR MOD. VBM - 2  3.000KG/H C/ ACESSORIOS',2900812.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 3.000KG/H'),('2900480.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 5000 KG/H VBM-5000',2900813.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO (BANHO MARIA) 5.000KG/H'),('2900472.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 150 KG/H VBMC-150',2900814.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO COMPACTO (BANHO MARIA) 150KG/H'),('2900624.0','VAPORIZADOR GLP A ÁGUA QUENTE - VBMC 300 KG/H',2900815.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO COMPACTO (BANHO MARIA) 300KG/H'),('2900574.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO AGUA QUENTE 300 KG/H VBMC-300',2900815.0,'VAPORIZADOR GLP AGUA QUENTE CONJUGADO COMPACTO (BANHO MARIA) 300KG/H'),('','item novo',2900816.0,'VAPORIZADOR GLP FEED-BACK AGUA QUENTE COM CIRCULACAO 500KG/H'),('2900646.0','VAPORIZADOR GLP(ES) LIQUEFEITO(S) DE PETROLE AGUA QUENTE VAPINDUS 1000 KG/H',2900817.0,'VAPORIZADOR GLP FEED-BACK AGUA QUENTE COM CIRCULACAO 1.000KG/H'),('2900635.0','VAPORIZADOR ATMOSFERICO P GLP GAS ES LIQUEFEITOS DE PETROLEO 100 KG/H',2900818.0,'VAPORIZADOR GLP ATMOSFERICO 100KG/H'),('2900522.0','VAPORIZADOR ATMOSFERICO P GLP GAS ES LIQUEFEITOS DE PETROLEO 150KG/H',2900819.0,'VAPORIZADOR GLP ATMOSFERICO 150KG/H'),('2900523.0','VAPORIZADOR ATMOSFERICO P GLP GAS ES LIQUEFEITOS DE PETROLEO 250KG/H',2900820.0,'VAPORIZADOR GLP ATMOSFERICO 250KG/H'),('2900524.0','VAPORIZADOR ATMOSFERICO P GLP GAS ES LIQUEFEITOS DE PETROLEO 350KG/H',2900821.0,'VAPORIZADOR GLP ATMOSFERICO 350KG/H'),('2900525.0','VAPORIZADOR ATMOSFERICO P GLP GAS ES LIQUEFEITOS DE PETROLEO 500KG/H',2900822.0,'VAPORIZADOR GLP ATMOSFERICO 500KG/H'),('2900526.0','VAPORIZADOR ATMOSFERICO P GLP GAS ES LIQUEFEITOS DE PETROLEO 750KG/H',2900823.0,'VAPORIZADOR GLP ATMOSFERICO 750KG/H'),('2900527.0','VAPORIZADOR ATMOSFERICO P GLP GAS ES LIQUEFEITOS DE PETROLEO 1000KG/H',2900824.0,'VAPORIZADOR GLP ATMOSFERICO 1.000KG/H'),('2900109.0','VAPORIZADOR GLP GAS(ES) LIQUEFEITO(S) DE PETROLEO  A VAPOR VERTICAL 200 KG/H',2900825.0,'VAPORIZADOR GLP A VAPOR 200KG/H'),('2900039.0','VAPORIZADOR GLP GAS(ES)  LIQUEFEITO(S) DE PETROLEO  A VAPOR VERTICAL 400 KG/H',2900826.0,'VAPORIZADOR GLP A VAPOR 400KG/H'),('2900272.0','VAPORIZADOR A VAPOR 600 KG',2900827.0,'VAPORIZADOR GLP A VAPOR 600KG/H'),('6000142.0','REGULADOR PRESSAO 1o. ESTAGIO, CE CS 1/2POL NPT, PE 1,5 a 18 BAR, PS 1,5 BAR, VAZ. 30KG/H, C/ MAN, COM OPSO',6000166.0,'REGULADOR DE PRESSAO 1º ESTAGIO COM OPSO, CE CS 1/2POL NPT, PE 1,5 a 18 BAR, PS 1,5 BAR, VAZ. 30KG/H, C/ MAN'),('6000141.0','REGULADOR 1º ESTAGIO C/ SHUTT OFF, CE CS 1/2POL NPT, PE 1,5 A 19 BAR, PS 0,5 A 2 BAR, VAZ. 60KG/H, C/ MAN',6000167.0,'REGULADOR DE PRESSAO 1º ESTAGIO COM OPSO, CE CS 1/2POL NPT, PE 2 A 18 BAR, PS 0,5 A 2 BAR, VAZ. 60KG/H, C/ MAN'),('','item novo',6000168.0,'REGULADOR DE PRESSAO 1º ESTAGIO COM OPSO, CE CS 3/4POL NPT, PE 1,5 A 18 BAR, PS 0,5 A 2 BAR, VAZ. 150KG/H, C/ MAN'),('','item novo',6000169.0,'REGULADOR DE PRESSAO 1º ESTAGIO COM OPSO, CE CS 1POL NPT, PE 2 A 18 BAR, PS 0,5 A 2 BAR, VAZ. 250KG/H, C/ MAN'),('','item novo',6000170.0,'REGULADOR DE PRESSAO 1º ESTAGIO COM OPSO, CE 1POL NPT CS 1.1/2POL NPT, PE 2 A 20 BAR, PS 1,1 A 1,9 BAR, VAZ. 500KG/H'),('','item novo',6000171.0,'REGULADOR DE PRESSAO 1º ESTAGIO COM OPSO, CE CS FLANGE 2POL 300LBS, PE 2 A 18 BAR, PS 0,8 A 4 BAR, VAZ. 1.000KG/H'),('2900153.0','GERADORA DE AGUA QUENTE CUMULUS GCP 40000 KCAL/H',2900838.0,'GERADORA DE ÁGUA QUENTE 40.000KCAL/H'),('2900265.0','GERADORA DE AGUA QUENTE 100.000 KCAL/H AQA-100',2900839.0,'GERADORA DE ÁGUA QUENTE 100.000KCAL/H'),('2900274.0','GERADOR DE AGUA QUENTE MORGANTI ET 40 - 40.000 KCAL',2900838.0,'GERADORA DE ÁGUA QUENTE 40.000KCAL/H'),('2900278.0','GERADORA DE AGUA QUENTE 40.000 KCAL/H AQA-40',2900838.0,'GERADORA DE ÁGUA QUENTE 40.000KCAL/H'),('2900428.0','GERADORA DE AGUA QUENTE ATE 800.000 KCAL/H',2900847.0,'GERADORA DE ÁGUA QUENTE 800.000KCAL/H'),('2900493.0','GERADOR DE AGUA QUENTE 150.000 KCAL/H AQA-150',2900840.0,'GERADORA DE ÁGUA QUENTE 150.000KCAL/H'),('2900512.0','GERADORA DE AGUA QUENTE 600.000 KCAL/H',2900846.0,'GERADORA DE ÁGUA QUENTE 600.000KCAL/H'),('2900573.0','GERADORA DE AGUA QUENTE HORIZONTAL 200.000 KCAL/H  ATH-200',2900843.0,'GERADORA DE ÁGUA QUENTE 200.000KCAL/H'),('2900596.0','GERADORA DE AGUA QUENTE 180.000 KCAL/H VAZÃO 150L/MIN MOD. R8000',2900842.0,'GERADORA DE ÁGUA QUENTE 180.000KCAL/H'),('2900661.0','GERADOR DE AGUA QUENTE 172.000 KCAL/H MODELO MEGA PREX N200',2900841.0,'GERADORA DE ÁGUA QUENTE 172.000KCAL/H'),('2900677.0','GERADOR DE AGUA QUENTE 258.000 KCAL/H MODELO MEGA PREX N300',2900844.0,'GERADORA DE ÁGUA QUENTE 258.000KCAL/H'),('2900681.0','GERADOR DE ÁGUA QUENTE LAMBORGHINI 145.000 kcal/h MODELO MEGA PREX N-120',2900839.0,'GERADORA DE ÁGUA QUENTE 100.000KCAL/H'),('2900708.0','GERADOR DE AGUA QUENTE 150.000 KCAL/H AQA-300',2900845.0,'GERADORA DE ÁGUA QUENTE 300.000KCAL/H'),('','',5800115.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 2 POL DIAMETRO INTERNO 2 POL RANGE 160 A 1600 KG/H'),('','',5800116.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 2 POL DIAMETRO INTERNO 1.1/2 POL RANGE 100 A 980 KG/H'),('','',5800117.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 2 POL DIAMETRO INTERNO 1 POL RANGE 40 A 400 KG/H'),('','',5800118.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 2 POL DIAMETRO INTERNO 3/4 POL RANGE 16 A 160 KG/H'),('','',5800119.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 2 POL DIAMETRO INTERNO 1/2 POL RANGE 10 A 80 KG/H'),('','',5800120.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 2 POL DIAMETRO INTERNO 3/8 POL RANGE 4 A 40 KG/H'),('','',5800121.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1.1/2 POL DIAMETRO INTERNO 1.1/2 POL RANGE 100 A 980 KG/H'),('','',5800122.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1.1/2 POL DIAMETRO INTERNO 1 POL RANGE 40 A 400 KG/H'),('','',5800123.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1.1/2 POL DIAMETRO INTERNO 1 POL RANGE 40 A 400 KG/H'),('','',5800124.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1.1/2 POL DIAMETRO INTERNO 3/4 POL RANGE 16 A 160 KG/H'),('','',5800125.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1.1/2 POL DIAMETRO INTERNO 1/2 POL RANGE 10 A 80 KG/H'),('','',5800126.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1.1/2 POL DIAMETRO INTERNO 3/8 POL RANGE 4 A 40 KG/H'),('','',5800127.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1 POL DIAMETRO INTERNO 1 POL RANGE 40 A 400 KG/H'),('','',5800128.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1 POL DIAMETRO INTERNO 3/4 POL RANGE 16 A 160 KG/H'),('','',5800129.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1 POL DIAMETRO INTERNO 1/2 POL RANGE 10 A 80 KG/H'),('','',5800130.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1 POL DIAMETRO INTERNO 3/8 POL RANGE 4 A 40 KG/H'),('','',5800131.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 3/4 POL DIAMETRO INTERNO 3/4 POL RANGE 16 A 160 KG/H'),('','',5800132.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 3/4 POL DIAMETRO INTERNO 1/2 POL RANGE 10 A 80 KG/H'),('','',5800133.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1 POL DIAMETRO INTERNO 3/8 POL RANGE 4 A 40 KG/H'),('','',5800134.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1/2 POL DIAMETRO INTERNO 1/2 POL RANGE 10 A 80 KG/H'),('','',5800135.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 1/2 POL DIAMETRO INTERNO 3/8 POL RANGE 4 A 40 KG/H'),('','',5800136.0,'INDICADOR TOTALIZADOR INTEGRAL 90 A 240 VAC'),('','',5800137.0,'INDICADOR TOTALIZADOR INTEGRAL 24 VDC'),('','',5800138.0,'INDICADOR TOTALIZADOR INTEGRAL BATERIA'),('','',5800112.0,'INDICADOR TOTALIZADOR REMOTO 90 A 240 VAC'),('','',5800140.0,'INDICADOR TOTALIZADOR REMOTO 24 VDC'),('','',5800141.0,'REGISTRADOR ELETRONICO DE VAZAO (DATA LOGER)'),('','',5800142.0,'MEDIDOR DE VAZAO TERMAL INSERCAO C/ CARTUCHO'),('','',5800143.0,'MEDIDOR DE VAZAO TERMAL INSERCAO S/ CARTUCHO'),('','',5800144.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 2.1/2 POL DIAMETRO INTERNO 1 POL RANGE 45 A 460 KG/H'),('','',5800145.0,'MEDIDOR DE VAZAO TIPO TURBINA PARA GAS CE CS 2.1/2 POL DIAMETRO INTERNO 3/4 POL RANGE 20 A 180 KG/H'),('','',2900876.0,'VAPORIZADOR GLP ELETRICO EX 100KG/H X 220V'),('','',2900877.0,'VAPORIZADOR GLP ELETRICO EX 100KG/H X 380V'),('','',2900878.0,'VAPORIZADOR GLP ELETRICO EX 100KG/H X 440V'),('','',2900879.0,'VAPORIZADOR GLP ELETRICO EX 160KG/H X 220V'),('','',2900880.0,'VAPORIZADOR GLP ELETRICO EX 160KG/H X 380V'),('','',2900881.0,'VAPORIZADOR GLP ELETRICO EX 160KG/H X 440V'),('','',2900882.0,'VAPORIZADOR GLP ELETRICO EX 200KG/H X 220V'),('','',2900883.0,'VAPORIZADOR GLP ELETRICO EX 200KG/H X 380V'),('','',2900884.0,'VAPORIZADOR GLP ELETRICO EX 200KG/H X 440V'),('','',2900885.0,'VAPORIZADOR GLP ELETRICO EX 240KG/H X 220V'),('','',2900886.0,'VAPORIZADOR GLP ELETRICO EX 240KG/H X 380V'),('','Prova Explosão',2900887.0,'VAPORIZADOR GLP ELETRICO EX 240KG/H X 440V'),('','',2900888.0,'VAPORIZADOR GLP ELETRICO EX 320KG/H X 220V'),('','',2900889.0,'VAPORIZADOR GLP ELETRICO EX 320KG/H X 380V'),('','',2900890.0,'VAPORIZADOR GLP ELETRICO EX 500KG/H X 220V'),('','',2900891.0,'VAPORIZADOR GLP ELETRICO EX 500KG/H X 380V'),('','',2900892.0,'VAPORIZADOR GLP ELETRICO EX 500KG/H X 440V'),('','',2900893.0,'VAPORIZADOR GLP ELETRICO EX 50KG/H X 220V'),('','',2900894.0,'VAPORIZADOR GLP ELETRICO EX 50KG/H X 380V'),('','',2900864.0,'MODULO DE REGULAGEM DE PRESSAO 1º ESTAGIO 50 KG/H, PE 2 A 18 BAR, PS 1,5 BAR'),('','',2900865.0,'MODULO DE REGULAGEM DE PRESSAO 1º ESTAGIO 120 KG/H, PE 2 A 18 BAR, PS 1,5 BAR'),('','',2900866.0,'MODULO DE REGULAGEM DE PRESSAO 1º ESTAGIO 150 KG/H, PE 2 A 18 BAR, PS 1,5 BAR'),('','',2900867.0,'MODULO DE REGULAGEM DE PRESSAO 1º ESTAGIO 200 KG/H, PE 2 A 18 BAR, PS 1,5 BAR'),('','',2900868.0,'MODULO DE REGULAGEM DE PRESSAO 1º ESTAGIO 250 KG/H, PE 2 A 18 BAR, PS 1,5 BAR'),('','',2900869.0,'MODULO DE REGULAGEM DE PRESSAO 1º ESTAGIO 300 KG/H, PE 2 A 18 BAR, PS 1,5 BAR'),('','',2900870.0,'MODULO DE REGULAGEM DE PRESSAO 1º ESTAGIO 500 KG/H, PE 2 A 18 BAR, PS 1,5 BAR'),('','',2900871.0,'MODULO DE REGULAGEM DE PRESSAO 1º ESTAGIO 1.000 KG/H, PE 2 A 18 BAR, PS 1,5 BAR');
/*!40000 ALTER TABLE `Saneamento Completo VS2_Plan1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-22 15:20:24