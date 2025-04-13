/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;

public abstract class aim
extends Enum<aim> {
    public static final /* enum */ aim a = new ain();
    public static final /* enum */ aim b = new aio_0();
    public static final /* enum */ aim c = new aip_0();
    static final float[] d;
    private static final /* synthetic */ aim[] e;

    public static aim[] values() {
        return (aim[])e.clone();
    }

    public static aim valueOf(String string) {
        return Enum.valueOf(aim.class, string);
    }

    public abstract void a(Entity3D var1, byte var2, float var3, float var4, float var5, float var6);

    static {
        e = new aim[]{a, b, c};
        d = new float[8];
    }
}

