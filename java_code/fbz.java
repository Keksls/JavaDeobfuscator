/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fbz
extends fbi_0 {
    private static final Logger d = Logger.getLogger(fbz.class);
    public static final fbj c = new fba_0();
    private int e;
    private int[] f;

    public fbz() {
        super(fbk.a);
    }

    public void b(int n) {
        this.e = n;
    }

    public void a(int[] nArray) {
        this.f = nArray;
    }

    @Override
    public void f() {
        faX faX2 = this.e();
        if (faX2 == null) {
            d.error((Object)("Impossible d'ex\u00e9cuter l'action " + this + " : la nation " + this.b + " n'existe pas"));
            return;
        }
        faX2.a(this.e, this.f);
    }

    @Override
    public boolean a(faU faU2) {
        return false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.e);
        if (this.f != null) {
            int n = this.f.length;
            for (int k = 0; k < n; ++k) {
                byteBuffer.putInt(this.f[k]);
            }
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.e = byteBuffer.getInt();
        int n = byteBuffer.remaining();
        if (n % 4 != 0) {
            d.error((Object)"Impossible de d\u00e9s\u00e9rialiser une nationActionRequest. Nombre d'octets restants non valides pour former des entiers... pas multiple de 4.");
            return false;
        }
        int n2 = n / 4;
        this.f = new int[n2];
        for (int k = 0; k < n2; ++k) {
            this.f[k] = byteBuffer.getInt();
        }
        return true;
    }

    @Override
    public int b() {
        if (this.f == null) {
            return 4;
        }
        return 4 + 4 * this.f.length;
    }

    @Override
    public void c() {
        this.f = null;
        this.b = -1;
        this.e = -1;
    }
}

