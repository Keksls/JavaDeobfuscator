/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

public final class Vo<Rated extends Vk> {
    private final ArrayList<Vm<Rated>> a = new ArrayList();
    private final HashMap<Rated, Integer> b = new HashMap();

    public Iterable<Vm<Rated>> a() {
        return this.a;
    }

    public int b() {
        return this.a.size();
    }

    public boolean a(Vm<Rated> vm) {
        if (vm == null || vm.c()) {
            return false;
        }
        Vk[] vkArray = vm.a();
        int[] nArray = vm.b();
        for (int k = 0; k < 2; ++k) {
            if (!this.b.containsKey(vkArray[k])) {
                this.b.put(vkArray[k], nArray[k]);
                continue;
            }
            if (this.b.get(vkArray[k]) == nArray[k]) continue;
            return false;
        }
        this.a.add(vm);
        return true;
    }

    public int a(Rated Rated) {
        return this.b.get(Rated);
    }
}

