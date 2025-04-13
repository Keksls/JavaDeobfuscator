/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Map;

/*
 * Renamed from QQ
 */
public class qq_0
extends qv_0 {
    final Map<Short, Integer> p;
    private final fo_1 q = new qs_0(this);

    @Override
    protected fo_1 b() {
        return new qr_0(this);
    }

    public qq_0(short s2, int n, int n2, short s3, short s4, boolean bl, boolean bl2, boolean bl3, boolean bl4, byte by, short s5, ArrayList<aff_1> arrayList, String string, Map<Short, Integer> map, int[] nArray, int n3) {
        super(s2, n, n2, s3, s4, bl, bl2, bl3, bl4, by, s5, arrayList, string, nArray, n3);
        this.p = map;
    }

    public byte[] c() {
        return this.a(new fo_1[]{this.q});
    }
}

