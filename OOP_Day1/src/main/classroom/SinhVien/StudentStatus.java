package main.classroom.SinhVien;

public enum StudentStatus {

    DANG_HOC("DangHoc"), DA_RA_TRUONG("DaRaTruong"), CHUAN_BI_NHAP_HOC("ChuanBiNhapHoc");

    private final String value;

    StudentStatus(final String newValue) {
        value = newValue;
    }

    public String getValue() {
        return value;
    }

}
