/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class fbj {
    private static final Logger a = Logger.getLogger(fbj.class);

    public abstract fbi_0 a();

    public static byte[] a(fbi_0 fbi_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5 + fbi_02.b());
        byteBuffer.put((byte)fbi_02.a().ordinal());
        byteBuffer.putInt(fbi_02.d());
        fbi_02.a(byteBuffer);
        return byteBuffer.array();
    }

    @Nullable
    public static fbi_0 a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte by = byteBuffer.get();
        fbi_0 fbi_02 = fbk.a(by);
        if (fbi_02 == null) {
            a.error((Object)("Impossible de d\u00e9coder une NactionActionRequest : type inconnu : " + by));
            return null;
        }
        fbi_02.a(byteBuffer.getInt());
        if (fbi_02.b(byteBuffer)) {
            return fbi_02;
        }
        a.error((Object)("Erreur \u00e0 la d\u00e9s\u00e9rialisation d'une requ\u00eate de type " + by));
        return null;
    }
}

