/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eWG
 */
class ewg_2
implements ewk_2 {
    private exk_2 a;

    ewg_2() {
    }

    ewg_2(exk_2 exk_22) {
        this.a = exk_22;
    }

    @Override
    public byte[] a() {
        vf_2 vf_22 = new vf_2();
        this.a.a(vf_22);
        ByteBuffer byteBuffer = ByteBuffer.allocate(vf_22.b());
        vf_22.a(byteBuffer);
        return byteBuffer.array();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        vf_2 vf_22 = new vf_2();
        vf_22.b(byteBuffer);
        this.a = eyo_1.g().a(vf_22);
    }

    @Override
    public void a(ewt_1 ewt_12) {
        ewt_12.d(this.a);
    }

    @Override
    public ewm_2 b() {
        return ewm_2.a;
    }

    public String toString() {
        return "AddItemChange{m_item=" + this.a + "}";
    }
}

