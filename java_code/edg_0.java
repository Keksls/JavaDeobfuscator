/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eDG
 */
public class edg_0
extends eDq<fio_0<? extends fin_0>> {
    public edg_0(fio_0<? extends fin_0> fio_02) {
        this(fio_02, null, null, eDk.b);
    }

    public edg_0(fio_0<? extends fin_0> fio_02, @Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2, eDk eDk2) {
        super(fio_02, fio_02.r().i(), fio_02.c(), eDi.ar.a(fio_02), arrayList, arrayList2, eDk2, eDi.aN);
    }

    @Override
    public void a(@NotNull ArrayList<String> arrayList) {
    }

    @Override
    public String a(@NotNull String string, @NotNull efh_0 efh_02) {
        return edg_0.a((fio_0)this.a, this.d(), string);
    }

    public static String a(fio_0 fio_02, short s2, String object) {
        So<efh_0> so;
        Matcher matcher = eDi.f.matcher(((String)object).trim());
        epq_2 epq_22 = eDi.ar.b(fio_02);
        So<efh_0> so2 = so = epq_22 == null ? null : epq_22.ge();
        while (matcher.find()) {
            String string = matcher.group(1);
            char c2 = string.charAt(0);
            block0 : switch (c2) {
                case 'a': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'p': {
                            object = ((String)object).substring(0, matcher.start()) + ((fin_0)fio_02.r()).h(fio_02, epq_22, null, so) + ((String)object).substring(matcher.end());
                            matcher = eDi.f.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'm': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'p': {
                            object = ((String)object).substring(0, matcher.start()) + ((fin_0)fio_02.r()).g(fio_02, (Object)epq_22, null, so) + ((String)object).substring(matcher.end());
                            matcher = eDi.f.matcher(((String)object).trim());
                            break block0;
                        }
                        case 'r': {
                            object = ((String)object).substring(0, matcher.start()) + ((fin_0)fio_02.r()).j(fio_02, epq_22, null, so) + ((String)object).substring(matcher.end());
                            matcher = eDi.f.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'M': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'r': {
                            object = ((String)object).substring(0, matcher.start()) + ((fin_0)fio_02.r()).i(fio_02, epq_22, null, so) + ((String)object).substring(matcher.end());
                            matcher = eDi.f.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'w': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'p': {
                            object = ((String)object).substring(0, matcher.start()) + ((fin_0)fio_02.r()).e(fio_02, (Object)epq_22, null, so) + ((String)object).substring(matcher.end());
                            matcher = eDi.f.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'e': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'l': {
                            efa_0 efa_02 = efa_0.a(((fin_0)fio_02.r()).q());
                            String string2 = eDi.a(efa_02);
                            object = ((String)object).substring(0, matcher.start()) + string2 + ((String)object).substring(matcher.end());
                            matcher = eDi.f.matcher(((String)object).trim());
                            break block0;
                        }
                    }
                    break;
                }
                case 'c': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'h': {
                            object = ((String)object).substring(0, matcher.start()) + eDi.ar.b() + ((String)object).substring(matcher.end());
                            matcher = eDi.f.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
                case 'l': {
                    char c3 = string.charAt(1);
                    switch (c3) {
                        case 'v': {
                            object = ((String)object).substring(0, matcher.start()) + (epq_22 == null ? (short)0 : epq_22.dr()) + ((String)object).substring(matcher.end());
                            matcher = eDi.f.matcher(((String)object).trim());
                        }
                    }
                    break;
                }
            }
        }
        return object;
    }
}

