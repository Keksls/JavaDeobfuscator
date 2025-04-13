/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byX
 */
public class byx_1
extends epk_0 {
    @Override
    public String a() {
        String string = super.a();
        if (string != null && !string.isEmpty()) {
            return string;
        }
        eBt eBt2 = this.b();
        if (eBt2 == null) {
            return string;
        }
        short s2 = eBt2.a();
        bpb_1 bpb_12 = bpc_1.a().a(s2);
        if (bpb_12 == null) {
            return string;
        }
        return bpb_12.f();
    }
}

