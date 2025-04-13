/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eZF
 */
public class ezf_0 {
    private tc_0[] a;
    private ezh_0 b;

    public ezf_0() {
    }

    public ezf_0(ezh_0 ezh_02) {
        this.b = ezh_02;
        this.a = new tc_0[0];
    }

    public tc_0[] a() {
        return this.a;
    }

    public void a(tc_0[] tc_0Array) {
        this.a = (tc_0[])tc_0Array.clone();
    }

    public ezh_0 b() {
        return this.b;
    }

    public void a(ezh_0 ezh_02) {
        this.b = ezh_02;
    }
}

