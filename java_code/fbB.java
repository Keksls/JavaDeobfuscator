/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fbB
extends fbi_0 {
    private static final Logger d = Logger.getLogger(fbB.class);
    public static final fbj c = new fbC();
    private int e;

    public fbB() {
        super(fbk.c);
    }

    public void b(int n) {
        this.e = n;
    }

    @Override
    public void f() {
        faX faX2 = this.e();
        if (faX2 == null) {
            d.error((Object)("Impossible d'ex\u00e9cuter l'action " + this + " : la nation " + this.b + " n'existe pas"));
            return;
        }
        faX2.c(this.e);
    }

    @Override
    public boolean a(faU faU2) {
        return false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.e);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.e = byteBuffer.getInt();
        return true;
    }

    @Override
    public int b() {
        return 4;
    }

    @Override
    public void c() {
        this.b = -1;
        this.e = -1;
    }
}

