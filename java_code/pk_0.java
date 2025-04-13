/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Pk
 */
class pk_0
extends fo_1 {
    final /* synthetic */ pj_0 d;

    pk_0(pj_0 pj_02) {
        this.d = pj_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Impossible de s\u00e9rialiser un \u00e9l\u00e9ment interactif c\u00f4t\u00e9 client");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        a.trace((Object)("D\u00e9codage des donn\u00e9es globales (len=" + byteBuffer.remaining() + ")"));
        if (byteBuffer.remaining() > 0) {
            if (byteBuffer.remaining() < 1) {
                a.error((Object)"Impossible de d\u00e9s\u00e9rialiser une partie vide");
                return;
            }
            int n2 = byteBuffer.get() & 0xFF;
            if (byteBuffer.remaining() != n2 * 6) {
                a.error((Object)("Impossible de d\u00e9s\u00e9rialiser " + n2 + " actions dans un buffer de " + byteBuffer.remaining() + " octets"));
                return;
            }
            for (int k = 0; k < n2; ++k) {
                short s2 = byteBuffer.getShort();
                int n3 = byteBuffer.getInt();
                Tv tv = Tv.a(s2);
                if (tv != null) {
                    this.d.t.put(tv, n3);
                    continue;
                }
                a.error((Object)("Pas de InteractiveElementAction d'ID=" + s2));
            }
        }
    }
}

