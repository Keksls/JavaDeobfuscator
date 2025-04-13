/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;

public final class aXZ
extends aXj {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    public static final byte g = 6;
    public static final byte h = 7;
    public static final byte i = 8;
    public static final byte j = 9;
    public static final byte k = 10;
    public static final byte l = 11;
    private final Object[] m;
    private final byte n;

    public aXZ(byte by, Object ... objectArray) {
        this.n = by;
        this.m = objectArray;
    }

    @Override
    public boolean a() {
        switch (this.n) {
            case 0: {
                return true;
            }
            case 1: 
            case 2: 
            case 3: 
            case 6: {
                if (this.m != null && this.m.length > 0 && this.m[0] instanceof Integer) {
                    return true;
                }
            }
            case 4: 
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                if (this.m == null || this.m.length != 1 || !(this.m[0] instanceof String)) break;
                return true;
            }
        }
        aVo.a().d("Type de recherche inconnue " + this.n);
        return false;
    }

    @Override
    public void b() {
        switch (this.n) {
            case 0: {
                this.c();
                break;
            }
            case 1: {
                this.b((byte)2);
                break;
            }
            case 3: 
            case 6: {
                this.b((byte)3);
                break;
            }
            case 2: {
                this.a((byte)3);
                break;
            }
            case 7: {
                Pattern pattern = Pattern.compile(((String)this.m[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                TIntObjectHashMap<fie_0> tIntObjectHashMap = bfj_1.b();
                int[] nArray = new int[]{0};
                tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new aYa(this, pattern, stringBuilder, nArray));
                stringBuilder.append("========\r\n").append(nArray[0]).append(" \u00e9tats trouv\u00e9s");
                aVo.a().a(stringBuilder.toString(), 0xFFFFFF);
                break;
            }
            case 4: {
                List<bjw_1> list = aXZ.d((String)this.m[0]);
                String string = aXZ.a(list, (String)this.m[0]);
                aVo.a().a(string, 0xFFFFFF);
                break;
            }
            case 8: {
                Pattern pattern = Pattern.compile(((String)this.m[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                TIntObjectHashMap<bhd_1> tIntObjectHashMap = bhe_0.a().b();
                int[] nArray = new int[]{0};
                tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new ayb_0(this, pattern, stringBuilder, nArray));
                stringBuilder.append("========\r\n").append(nArray[0]).append(" sets found");
                aVo.a().a(stringBuilder.toString(), 0xFFFFFF);
                break;
            }
            case 5: {
                Pattern pattern = Pattern.compile(((String)this.m[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                TIntObjectHashMap<bpb_1> tIntObjectHashMap = bpc_1.a().c();
                int[] nArray = new int[]{0};
                tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new aYc(this, pattern, stringBuilder, nArray));
                stringBuilder.append("========\r\n").append(nArray[0]).append(" items found");
                aVo.a().a(stringBuilder.toString(), 0xFFFF00);
                break;
            }
            case 9: {
                Pattern pattern = Pattern.compile(((String)this.m[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                int[] nArray = new int[]{0};
                bhp_1.a.a(new aYd(this, pattern, stringBuilder, nArray));
                stringBuilder.append("========\r\n").append(nArray[0]).append(" items found");
                aVo.a().a(stringBuilder.toString(), 0xFFFF00);
                break;
            }
            case 10: {
                Pattern pattern = Pattern.compile(((String)this.m[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                TIntObjectHashMap<bph_0> tIntObjectHashMap = bpp_0.a().b();
                int[] nArray = new int[]{0};
                tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new aYe(this, pattern, stringBuilder, nArray));
                stringBuilder.append("========\r\n").append(nArray[0]).append(" items found");
                aVo.a().a(stringBuilder.toString(), 0xFFFFFF);
                break;
            }
            case 11: {
                String string = ((String)this.m[0]).toLowerCase();
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                brs_0.a.a().forEach(eco_02 -> {
                    String string2 = bae.h().a(15, (long)eco_02.k().a(), new Object[0]).toLowerCase();
                    if (string2.contains(string)) {
                        stringBuilder.append(eco_02.e()).append(" : ").append(string2).append("\r\n");
                    }
                });
                aVo.a().a(stringBuilder.toString(), 0xFFFFFF);
                break;
            }
        }
    }

    public static List<bjw_1> d(String string) {
        if (string == null) {
            return List.of();
        }
        String string3 = ".*?" + Cz.e(string) + ".*?";
        Function<String, Boolean> function = Cz.s(string3) ? string2 -> string2.matches(string3) : string2 -> Cz.a(string2, string);
        ArrayList<bjw_1> arrayList = new ArrayList<bjw_1>();
        for (bjw_1 bjw_12 : bhb_0.d().a()) {
            if (!function.apply(Cz.e(bjw_12.e())).booleanValue()) continue;
            arrayList.add(bjw_12);
        }
        return arrayList;
    }

    public static String a(List<bjw_1> list, String string) {
        StringBuilder stringBuilder = new StringBuilder("\nResult for \"").append(string).append("\" :\r\n========\r\n");
        for (bjw_1 bjw_12 : list) {
            stringBuilder.append(bjw_12.n()).append(" : ").append(bjw_12.e());
            if (bjw_12.F().h().length > 0 && bjw_12.M() != null) {
                String string2 = bae.h().a("item.rarity." + bjw_12.M().name(), new Object[0]);
                stringBuilder.append(' ').append('(').append(string2).append(')');
            }
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("========\r\n").append(list.size()).append(" items found");
        return stringBuilder.toString();
    }

    private void c() {
        aXZ.a("/!\\ Don't type search but these commands : si \"itemName\" -> search itemId, sm monsterId (limit) -> search monsters with this Id (if another number is given, its limit the search result. It is 10 by default), sm monsterId (limit) (nation | territory | instance) optionId -> search monsters with this id in the given location (when no option is given it will search globally) smi \"name\" -> search monsterId, search quest \"questName\" -> search questId, ss \"monsterName\" -> search the states for the monsters with this name, sr \"recipeName\" -> search the recipe with this name.");
    }

    private void a(byte by) {
        aaw_2 aaw_22;
        Pt pt = new Pt();
        pt.b(this.n);
        pt.a((short)167);
        pt.a(by);
        pt.a((Integer)this.m[0]);
        pt.a((Integer)this.m[1]);
        if (this.m.length > 2) {
            pt.a((String)this.m[2]);
            pt.a((Integer)this.m[3]);
        }
        if ((aaw_22 = azu_0.j().K()) != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private void b(byte by) {
        Pt pt = new Pt();
        pt.b(this.n);
        pt.a((short)167);
        pt.a(by);
        pt.a((Integer)this.m[0]);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

