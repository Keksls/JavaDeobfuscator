/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEC
 */
public class cec_1
extends cer_0 {
    public static final byte a = 3;
    private final cdh_0 b;
    private final short c;

    public cec_1(cdh_0 cdh_02, short s2) {
        super(cel_0.e);
        this.b = cdh_02;
        this.c = s2;
    }

    public cec_1(alo_1 alo_12, cdh_0 cdh_02, short s2) {
        super(cel_0.e, alo_12);
        this.b = cdh_02;
        this.c = s2;
    }

    public cdh_0 a() {
        return this.b;
    }

    public short b() {
        return this.c;
    }

    @Override
    public byte c() {
        return 3;
    }

    @Override
    public int d() {
        return 3;
    }

    @Override
    public String e() {
        return "AudioMarker - " + this.g().a();
    }

    @Override
    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id = ").append(this.b.e()).append(" quantit\u00e9 = ").append(this.c);
        alo_1 alo_12 = this.j();
        if (alo_12 != null) {
            stringBuilder.append(" Position = [").append(alo_12.o()).append(",").append(alo_12.p()).append("]");
        }
        return stringBuilder.toString();
    }
}

