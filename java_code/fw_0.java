/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Renamed from Fw
 */
public class fw_0
extends Ft {
    private final short[] b;

    public fw_0(short ... sArray) {
        this.b = (short[])sArray.clone();
    }

    @Override
    public final int a() {
        return this.b[this.a++] & 0xFFFF;
    }

    @Override
    public List<Integer> b() {
        return Arrays.stream(Cg.a(this.b)).map(Integer::valueOf).collect(Collectors.toList());
    }
}

