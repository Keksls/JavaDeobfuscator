/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bGa
 */
class bga_1
extends fo_1 {
    final /* synthetic */ bFZ d;

    bga_1(bFZ bFZ2) {
        this.d = bFZ2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Les \u00e9l\u00e9ments interactifs client ne peuvent pas \u00eatre s\u00e9rialis\u00e9s");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        a.trace((Object)("D\u00e9codage des donn\u00e9es sp\u00e9cifiques (len=" + byteBuffer.remaining() + ")"));
        if (byteBuffer.remaining() < 1) {
            a.error((Object)"Impossible de d\u00e9s\u00e9rialiser un \u00e9l\u00e9ment interactif vide");
            return;
        }
        if (byteBuffer.remaining() < 23) {
            a.error((Object)("Taille de donn\u00e9es restantes dans le buffer invalide : " + byteBuffer.remaining()));
            return;
        }
        bFZ.a(this.d, (long)byteBuffer.getShort());
        bFZ.a(this.d).b(byteBuffer.getInt());
        bFZ.b(this.d).c(byteBuffer.getInt());
        bFZ.c(this.d).a(byteBuffer.getShort());
        bFZ.a(this.d, byteBuffer.getShort());
        this.d.f(byteBuffer.get() != 0);
        bFZ.a(this.d, byteBuffer.get() != 0);
        this.d.a(aej_2.a(byteBuffer.get()));
        bFZ.b(this.d, byteBuffer.getShort());
        short s2 = byteBuffer.getShort();
        for (int k = s2 - 1; k >= 0; --k) {
            aff_1 aff_12 = new aff_1();
            aff_12.b(byteBuffer.getInt());
            aff_12.c(byteBuffer.getInt());
            aff_12.a(byteBuffer.getShort());
            bFZ.d(this.d).add(aff_12);
        }
        byte[] byArray = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray);
        bFZ.a(this.d, Cz.a(byArray));
        this.d.b(eud_1.a(byteBuffer));
        byteBuffer.getInt();
        if (byteBuffer.remaining() == 2) {
            bFZ.b(this.d, byteBuffer.get() == 1);
            bFZ.c(this.d, byteBuffer.get() == 1);
        }
        this.d.ar_();
        this.d.ax();
        if (byteBuffer.remaining() > 0) {
            a.error((Object)("Il reste des donn\u00e9es non trait\u00e9es dans le buffer : " + byteBuffer.remaining()));
        }
    }
}

