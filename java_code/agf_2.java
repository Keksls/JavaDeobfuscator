/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;

/*
 * Renamed from aGf
 */
public abstract class agf_2
extends Enum<agf_2> {
    public static final /* enum */ agf_2 a = new agg_2();
    public static final /* enum */ agf_2 b = new agh_2();
    public static final /* enum */ agf_2 c = new agi_2();
    private static final /* synthetic */ agf_2[] d;

    public static agf_2[] values() {
        return (agf_2[])d.clone();
    }

    public static agf_2 valueOf(String string) {
        return Enum.valueOf(agf_2.class, string);
    }

    public abstract ByteBuffer a(ByteBuf var1);

    static {
        d = new agf_2[]{a, b, c};
    }
}

