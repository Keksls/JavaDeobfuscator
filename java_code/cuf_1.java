/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuF
 */
public class cuf_1
extends ps_0 {
    private esl_2 a;
    private esz_1 b;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        esn_2 esn_22 = esn_2.a(byteBuffer.get());
        this.a = (esl_2)esn_22.createNew();
        this.a.b(byteBuffer);
        this.b = esz_1.a(byteBuffer.getInt());
        return true;
    }

    public esl_2 b() {
        return this.a;
    }

    public esz_1 c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12546;
    }

    @Override
    public String toString() {
        return "HavenWorldManageActionResult{m_error=" + this.b + "}";
    }
}

