/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Renamed from Fu
 */
public class fu_0
extends Ft {
    private final byte[] b;

    public fu_0(byte ... byArray) {
        this.b = (byte[])byArray.clone();
    }

    @Override
    public final int a() {
        return this.b[this.a++] & 0xFF;
    }

    @Override
    public List<Integer> b() {
        return Arrays.stream(Cg.a(this.b)).map(Integer::valueOf).collect(Collectors.toList());
    }
}

