/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKn
 */
public class fkn_1
extends we_0 {
    private final ajf_1 c;
    private final String[] d;

    public fkn_1(wu_0 wu_02, ajf_1 ajf_12, String ... stringArray) {
        super(wu_02);
        this.c = ajf_12;
        this.d = new String[stringArray.length];
        System.arraycopy(stringArray, 0, this.d, 0, stringArray.length);
    }

    @Override
    public void a(wq_0 wq_02) {
        fis_1.a().a(this.c, this.d);
    }
}

