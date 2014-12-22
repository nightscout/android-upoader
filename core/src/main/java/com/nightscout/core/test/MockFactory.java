package com.nightscout.core.test;

import com.nightscout.core.dexcom.TrendArrow;
import com.nightscout.core.dexcom.records.CalRecord;
import com.nightscout.core.dexcom.records.CalSubrecord;
import com.nightscout.core.dexcom.records.EGVRecord;
import com.nightscout.core.dexcom.records.GlucoseDataSet;
import com.nightscout.core.dexcom.records.MeterRecord;
import com.nightscout.core.dexcom.records.SensorRecord;
import com.nightscout.core.protobuf.G4Download;
import com.nightscout.core.records.DeviceStatus;

import org.joda.time.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class MockFactory {
    public static GlucoseDataSet mockGlucoseDataSet() {
        EGVRecord egvRecord = new EGVRecord(
                1,
                TrendArrow.DOUBLE_DOWN,
                new DateTime(0).toDate(),
                new DateTime(5).toDate(),
                G4Download.Noise.CLEAN);
        SensorRecord sensorRecord = new SensorRecord(new byte[SensorRecord.RECORD_SIZE]);
        return new GlucoseDataSet(egvRecord, sensorRecord);
    }

    public static MeterRecord mockMeterRecord() {
        return new MeterRecord(new byte[MeterRecord.RECORD_SIZE]);
    }

    public static CalRecord mockCalRecord() {
        return new CalRecord(new byte[CalRecord.RECORD_SIZE]);
    }

    public static DeviceStatus mockDeviceStatus() {
        DeviceStatus output = new DeviceStatus();
        output.setBatteryLevel(999);
        return output;
    }

    public static EGVRecord[] mockEGVPage() throws ParseException {
        DateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
        format.setTimeZone(TimeZone.getDefault());
        EGVRecord[] record = new EGVRecord[61];

        record[0] = new EGVRecord(108, TrendArrow.DOWN_45, 186923993, 186945595, G4Download.Noise.CLEAN);
        record[1] = new EGVRecord(115, TrendArrow.FLAT, 186924293, 186945895, G4Download.Noise.CLEAN);
        record[2] = new EGVRecord(137, TrendArrow.UP_45, 186924893, 186946495, G4Download.Noise.CLEAN);
        record[3] = new EGVRecord(147, TrendArrow.UP_45, 186925193, 186946795, G4Download.Noise.CLEAN);
        record[4] = new EGVRecord(245, TrendArrow.NOT_COMPUTABLE, 186941692, 186963294, G4Download.Noise.CLEAN);
        record[5] = new EGVRecord(247, TrendArrow.NOT_COMPUTABLE, 186941992, 186963595, G4Download.Noise.CLEAN);
        record[6] = new EGVRecord(244, TrendArrow.NOT_COMPUTABLE, 186942292, 186963894, G4Download.Noise.CLEAN);
        record[7] = new EGVRecord(243, TrendArrow.NOT_COMPUTABLE, 186942592, 186964194, G4Download.Noise.CLEAN);
        record[8] = new EGVRecord(240, TrendArrow.FLAT, 186942892, 186964494, G4Download.Noise.CLEAN);
        record[9] = new EGVRecord(229, TrendArrow.DOWN_45, 186943192, 186964794, G4Download.Noise.CLEAN);
        record[10] = new EGVRecord(213, TrendArrow.SINGLE_DOWN, 186943492, 186965094, G4Download.Noise.CLEAN);
        record[11] = new EGVRecord(202, TrendArrow.SINGLE_DOWN, 186943792, 186965394, G4Download.Noise.CLEAN);
        record[12] = new EGVRecord(206, TrendArrow.DOWN_45, 186944092, 186965694, G4Download.Noise.CLEAN);
        record[13] = new EGVRecord(207, TrendArrow.FLAT, 186944392, 186965994, G4Download.Noise.CLEAN);
        record[14] = new EGVRecord(205, TrendArrow.FLAT, 186944692, 186966294, G4Download.Noise.CLEAN);
        record[15] = new EGVRecord(208, TrendArrow.FLAT, 186944992, 186966594, G4Download.Noise.CLEAN);
        record[16] = new EGVRecord(212, TrendArrow.FLAT, 186945292, 186966894, G4Download.Noise.CLEAN);
        record[17] = new EGVRecord(216, TrendArrow.FLAT, 186945592, 186967194, G4Download.Noise.CLEAN);
        record[18] = new EGVRecord(219, TrendArrow.FLAT, 186945892, 186967494, G4Download.Noise.CLEAN);
        record[19] = new EGVRecord(222, TrendArrow.FLAT, 186946192, 186967794, G4Download.Noise.CLEAN);
        record[20] = new EGVRecord(225, TrendArrow.FLAT, 186946492, 186968094, G4Download.Noise.CLEAN);
        record[21] = new EGVRecord(225, TrendArrow.FLAT, 186946792, 186968394, G4Download.Noise.CLEAN);
        record[22] = new EGVRecord(224, TrendArrow.FLAT, 186947092, 186968694, G4Download.Noise.CLEAN);
        record[23] = new EGVRecord(239, TrendArrow.FLAT, 186947692, 186969294, G4Download.Noise.CLEAN);
        record[24] = new EGVRecord(249, TrendArrow.UP_45, 186947992, 186969594, G4Download.Noise.CLEAN);
        record[25] = new EGVRecord(255, TrendArrow.UP_45, 186948292, 186969894, G4Download.Noise.CLEAN);
        record[26] = new EGVRecord(272, TrendArrow.UP_45, 186948892, 186970494, G4Download.Noise.CLEAN);
        record[27] = new EGVRecord(283, TrendArrow.SINGLE_UP, 186949192, 186970794, G4Download.Noise.CLEAN);
        record[28] = new EGVRecord(284, TrendArrow.UP_45, 186949492, 186971094, G4Download.Noise.CLEAN);
        record[29] = new EGVRecord(272, TrendArrow.FLAT, 186949792, 186971394, G4Download.Noise.CLEAN);
        record[30] = new EGVRecord(278, TrendArrow.FLAT, 186950091, 186971694, G4Download.Noise.LIGHT);
        record[31] = new EGVRecord(262, TrendArrow.FLAT, 186950391, 186971994, G4Download.Noise.LIGHT);
        record[32] = new EGVRecord(234, TrendArrow.DOUBLE_DOWN, 186950691, 186972294, G4Download.Noise.LIGHT);
        record[33] = new EGVRecord(155, TrendArrow.DOUBLE_DOWN, 186950992, 186972594, G4Download.Noise.CLEAN);
        record[34] = new EGVRecord(135, TrendArrow.DOUBLE_DOWN, 186951291, 186972894, G4Download.Noise.CLEAN);
        record[35] = new EGVRecord(122, TrendArrow.DOUBLE_DOWN, 186951591, 186973194, G4Download.Noise.CLEAN);
        record[36] = new EGVRecord(118, TrendArrow.DOUBLE_DOWN, 186951893, 186973495, G4Download.Noise.CLEAN);
        record[37] = new EGVRecord(121, TrendArrow.DOWN_45, 186952192, 186973794, G4Download.Noise.CLEAN);
        record[38] = new EGVRecord(127, TrendArrow.FLAT, 186952492, 186974094, G4Download.Noise.CLEAN);
        record[39] = new EGVRecord(137, TrendArrow.UP_45, 186952792, 186974394, G4Download.Noise.CLEAN);
        record[40] = new EGVRecord(157, TrendArrow.UP_45, 186953692, 186975294, G4Download.Noise.CLEAN);
        record[41] = new EGVRecord(158, TrendArrow.UP_45, 186953992, 186975594, G4Download.Noise.CLEAN);
        record[42] = new EGVRecord(164, TrendArrow.UP_45, 186954292, 186975895, G4Download.Noise.CLEAN);
        record[43] = new EGVRecord(164, TrendArrow.FLAT, 186954591, 186976194, G4Download.Noise.CLEAN);
        record[44] = new EGVRecord(166, TrendArrow.FLAT, 186954891, 186976494, G4Download.Noise.CLEAN);
        record[45] = new EGVRecord(174, TrendArrow.FLAT, 186955191, 186976794, G4Download.Noise.CLEAN);
        record[46] = new EGVRecord(167, TrendArrow.FLAT, 186955491, 186977094, G4Download.Noise.CLEAN);
        record[47] = new EGVRecord(170, TrendArrow.FLAT, 186955791, 186977394, G4Download.Noise.CLEAN);
        record[48] = new EGVRecord(169, TrendArrow.FLAT, 186956091, 186977694, G4Download.Noise.CLEAN);
        record[49] = new EGVRecord(168, TrendArrow.FLAT, 186956391, 186977994, G4Download.Noise.CLEAN);
        record[50] = new EGVRecord(166, TrendArrow.FLAT, 186956691, 186978294, G4Download.Noise.CLEAN);
        record[51] = new EGVRecord(166, TrendArrow.FLAT, 186956991, 186978594, G4Download.Noise.CLEAN);
        record[52] = new EGVRecord(161, TrendArrow.FLAT, 186957291, 186978894, G4Download.Noise.CLEAN);
        record[53] = new EGVRecord(171, TrendArrow.FLAT, 186957591, 186979194, G4Download.Noise.CLEAN);
        record[54] = new EGVRecord(166, TrendArrow.FLAT, 186957891, 186979494, G4Download.Noise.CLEAN);
        record[55] = new EGVRecord(173, TrendArrow.FLAT, 186958191, 186979794, G4Download.Noise.CLEAN);
        record[56] = new EGVRecord(178, TrendArrow.FLAT, 186958491, 186980094, G4Download.Noise.CLEAN);
        record[57] = new EGVRecord(181, TrendArrow.FLAT, 186959092, 186980695, G4Download.Noise.CLEAN);
        record[58] = new EGVRecord(181, TrendArrow.FLAT, 186959092, 186980695, G4Download.Noise.CLEAN);
        record[59] = new EGVRecord(186, TrendArrow.FLAT, 186959393, 186980995, G4Download.Noise.CLEAN);
        record[60] = new EGVRecord(186, TrendArrow.FLAT, 186959393, 186980995, G4Download.Noise.CLEAN);
        return record;
    }

    public static MeterRecord[] mockMeterPage() throws ParseException {
        DateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
        format.setTimeZone(TimeZone.getDefault());
        MeterRecord[] record = new MeterRecord[10];
        record[0] = new MeterRecord(113, 186155018, 186133445, 186155048);
        record[1] = new MeterRecord(70, 186299694, 186278121, 186299724);
        record[2] = new MeterRecord(72, 186299717, 186278144, 186299747);
        record[3] = new MeterRecord(262, 186306654, 186285082, 186306684);
        record[4] = new MeterRecord(85, 186384870, 186363298, 186384900);
        record[5] = new MeterRecord(82, 186505003, 186483431, 186505033);
        record[6] = new MeterRecord(296, 186602003, 186580430, 186602033);
        record[7] = new MeterRecord(117, 186705166, 186683594, 186705196);
        record[8] = new MeterRecord(121, 186705180, 186683607, 186705210);
        record[9] = new MeterRecord(83, 186782153, 186760581, 186782183);
        return record;
    }

    public static SensorRecord[] mockSensorPage() throws ParseException {
        DateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
        format.setTimeZone(TimeZone.getDefault());
        SensorRecord[] record = new SensorRecord[43];
        record[0] = new SensorRecord(146752, 149472, 186, 186945291, 186966894);
        record[1] = new SensorRecord(148416, 151552, 190, 186945591, 186967194);
        record[2] = new SensorRecord(150208, 153696, 181, 186945891, 186967494);
        record[3] = new SensorRecord(152288, 155520, 186, 186946191, 186967794);
        record[4] = new SensorRecord(154400, 156928, 189, 186946491, 186968094);
        record[5] = new SensorRecord(156064, 156896, 185, 186946791, 186968394);
        record[6] = new SensorRecord(156992, 156736, 185, 186947091, 186968694);
        record[7] = new SensorRecord(159072, 165792, 186, 186947691, 186969294);
        record[8] = new SensorRecord(162400, 171808, 191, 186947991, 186969594);
        record[9] = new SensorRecord(167488, 175456, 188, 186948291, 186969894);
        record[10] = new SensorRecord(177568, 185568, 164, 186948891, 186970494);
        record[11] = new SensorRecord(182208, 192064, 184, 186949191, 186970794);
        record[12] = new SensorRecord(187136, 193216, 194, 186949491, 186971093);
        record[13] = new SensorRecord(190752, 185696, 190, 186949791, 186971393);
        record[14] = new SensorRecord(189184, 167584, 187, 186950091, 186971693);
        record[15] = new SensorRecord(179552, 149824, 173, 186950391, 186971993);
        record[16] = new SensorRecord(162848, 132352, 182, 186950691, 186972293);
        record[17] = new SensorRecord(142848, 114944, 191, 186950991, 186972593);
        record[18] = new SensorRecord(123984, 102832, 188, 186951291, 186972893);
        record[19] = new SensorRecord(108784, 94720, 160, 186951591, 186973193);
        record[20] = new SensorRecord(98320, 92416, 928, 186951892, 186973495);
        record[21] = new SensorRecord(92944, 94432, 418, 186952191, 186973794);
        record[22] = new SensorRecord(92160, 97664, 419, 186952491, 186974094);
        record[23] = new SensorRecord(94976, 103648, 419, 186952791, 186974394);
        record[24] = new SensorRecord(111536, 116256, 420, 186953691, 186975294);
        record[25] = new SensorRecord(115296, 116464, 419, 186953991, 186975594);
        record[26] = new SensorRecord(117328, 119968, 673, 186954292, 186975894);
        record[27] = new SensorRecord(118464, 120016, 168, 186954591, 186976193);
        record[28] = new SensorRecord(119488, 121424, 163, 186954891, 186976493);
        record[29] = new SensorRecord(121136, 126464, 172, 186955191, 186976793);
        record[30] = new SensorRecord(122848, 122112, 175, 186955491, 186977093);
        record[31] = new SensorRecord(124016, 124128, 180, 186955791, 186977393);
        record[32] = new SensorRecord(124288, 123392, 173, 186956091, 186977693);
        record[33] = new SensorRecord(123680, 122656, 176, 186956391, 186977993);
        record[34] = new SensorRecord(122944, 121712, 179, 186956691, 186978293);
        record[35] = new SensorRecord(122224, 121456, 177, 186956991, 186978593);
        record[36] = new SensorRecord(121328, 118496, 175, 186957291, 186978893);
        record[37] = new SensorRecord(120848, 124432, 179, 186957591, 186979193);
        record[38] = new SensorRecord(121024, 121312, 162, 186957891, 186979493);
        record[39] = new SensorRecord(122064, 125744, 164, 186958191, 186979793);
        record[40] = new SensorRecord(124064, 128624, 163, 186958491, 186980093);
        record[41] = new SensorRecord(128560, 130288, 680, 186959092, 186980694);
        record[42] = new SensorRecord(130416, 133504, 946, 186959392, 186980995);
        return record;
    }

    public static CalRecord[] mockCal505Page() throws ParseException {
        CalRecord[] record = new CalRecord[2];
        CalSubrecord[] subrecord0 = new CalSubrecord[2];
        subrecord0[0] = new CalSubrecord(121, 70130, 186705605, 186705180);
        subrecord0[1] = new CalSubrecord(83, 74480, 186782402, 186782153);
        CalSubrecord[] subrecord1 = new CalSubrecord[2];
        subrecord1[0] = new CalSubrecord(121, 70130, 186705605, 186705180);
        subrecord1[1] = new CalSubrecord(83, 74480, 186782402, 186782153);
        record[0] = new CalRecord(17791.61320896296, 512.6837392183724, 0.9, 0.5, 186959093, 186980695, subrecord0);
        record[1] = new CalRecord(17791.61320896296, 512.6837392183724, 0.9, 0.5, 186959393, 186980995, subrecord1);
        return record;
    }

    public static CalRecord[] mockCalPre505Page() throws ParseException {
        CalSubrecord[] subrec = new CalSubrecord[6];
        subrec[0] = new CalSubrecord(102, 109056, 180243725, 180243367);
        subrec[1] = new CalSubrecord(45, 82816, 180294423, 180294101);
        subrec[2] = new CalSubrecord(52, 85056, 180328322, 180328043);
        subrec[3] = new CalSubrecord(80, 101136, 180370320, 180369852);
        subrec[4] = new CalSubrecord(80, 117408, 180455817, 180455393);
        subrec[5] = new CalSubrecord(106, 156704, 180549714, 180549424);
        CalRecord[] record = new CalRecord[1];
        record[0] = new CalRecord(38809.93262015008, 901.7557081270957, 0.9, 0.0, 187193265, 180549714, subrec);
        return record;
    }

}
