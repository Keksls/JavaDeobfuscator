/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import gnu.trove.set.hash.THashSet;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aZS
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class azs_0
extends gl_0 {
    private static final float er = 100.0f;
    private static final Logger es = Logger.getLogger(azs_0.class);
    public static final String a = "config.properties";
    public static final String b = "ANMEquipmentPath";
    public static final String c = "ANMResourcePath";
    public static final String d = "playerGfxPath";
    public static final String e = "npcGfxPath";
    public static final String f = "petGfxPath";
    public static final String g = "gfxConfigFile";
    public static final String h = "ANMInteractiveElementPath";
    public static final String i = "ANMDynamicElementPath";
    public static final String j = "ANMIndexFile";
    public static final String k = "ANMGUIPath";
    public static final String l = "ANMPreloadFilePattern";
    public static final String m = "i18nPath";
    public static final String n = "dialogsPath";
    public static final String o = "useXmlTheme";
    public static final String p = "langIconsPath";
    public static final String q = "worldPositionMarkerApsPath";
    public static final String r = "mapsPoiPath";
    public static final String s = "newPoiPath";
    public static final String t = "zaapPoiPath";
    public static final String u = "dragoPoiPath";
    public static final String v = "cannonPoiPath";
    public static final String w = "boatPoiPath";
    public static final String x = "mapsTplgCoord";
    public static final String y = "mapsGfxCoord";
    public static final String z = "mapsGfxPath";
    public static final String A = "mapsLightPath";
    public static final String B = "mapsTopologyPath";
    public static final String C = "mapsEnvironmentPath";
    public static final String D = "mapsAmbienceDataPath";
    public static final String E = "worldInfoFile";
    public static final String F = "ambienceBankFile";
    public static final String G = "gfxPath";
    public static final String H = "playListBankFile";
    public static final String I = "soundSourceFlavor";
    public static final String J = "useLuaAudio";
    public static final String K = "particlesAudioFile";
    public static final String L = "animatedElementsAudioFile";
    public static final String M = "dynamicSoundAmbianceFile";
    public static final String N = "sfxSoundPath";
    public static final String O = "amb2DPath";
    public static final String P = "amb3DPath";
    public static final String Q = "musicPath";
    public static final String R = "voicesPath";
    public static final String S = "fightSoundPath";
    public static final String T = "guiSoundPath";
    public static final String U = "foleysSoundPath";
    public static final String V = "particlesSoundPath";
    public static final String W = "shadersPath";
    public static final String X = "videosPath";
    public static final String Y = "highLightGfxPath";
    public static final String Z = "particlePath";
    public static final String aa = "scriptPath";
    public static final String ab = "defaultIconPath";
    public static final String ac = "spellsIconsPath";
    public static final String ad = "groupDifficultyIconsPath";
    public static final String ae = "ecosystemDifficultyIconsPath";
    public static final String af = "ecosystemProtectedIconPath";
    public static final String ag = "osamodasMonsterIconPath";
    public static final String ah = "groupDifficultyChallengeIconPath";
    public static final String ai = "companionInFightIconsPath";
    public static final String aj = "frescoPath";
    public static final String ak = "itemsIconsPath";
    public static final String al = "elementsIconsPath";
    public static final String am = "elementsSmallIconsPath";
    public static final String an = "targetEffectIconsPath";
    public static final String ao = "areasIconsPath";
    public static final String ap = "areasBigIconsPath";
    public static final String aq = "statesIconsPath";
    public static final String ar = "timePointBonusIconsPath";
    public static final String as = "effectAreasIconsPath";
    public static final String at = "breedSmallBackgroundsPath";
    public static final String au = "breedBigBackgroundsPath";
    public static final String av = "breedIconPath";
    public static final String aw = "popupIconPath";
    public static final String ax = "mentorIconPath";
    public static final String ay = "breedSmallIconPath";
    public static final String az = "breedBigIconPath";
    public static final String aA = "breedContactListIllustrationPath";
    public static final String aB = "breedIllustrationPath";
    public static final String aC = "breedPortraitIllustrationPath";
    public static final String aD = "breedCircleIllustrationPath";
    public static final String aE = "breedCharacterChoiceIllustrationPath";
    public static final String aF = "breedCharacterSelectionIllustrationPath";
    public static final String aG = "breedCharacterSheetIllustrationPath";
    public static final String aH = "monsterIllustrationPath";
    public static final String aI = "bossIllustrationPath";
    public static final String aJ = "defaultBossIllustrationPath";
    public static final String aK = "defaultMonsterIllustrationPath";
    public static final String aL = "defaultSmallMonsterIllustrationPath";
    public static final String aM = "shortcutBackgroundPath";
    public static final String aN = "skillsIconsPath";
    public static final String aO = "challengeCategoryIconsPath";
    public static final String aP = "challengeUserTypeIconsPath";
    public static final String aQ = "challengeResultQualityIconsPath";
    public static final String aR = "compassIconsPath";
    public static final String aS = "guildBlazonBackgroundPartPath";
    public static final String aT = "guildBlazonForegroundPartPath";
    public static final String aU = "guildRankIconsPath";
    public static final String aV = "aptitudeIconsPath";
    public static final String aW = "dimensionalBagPrimaryGemPath";
    public static final String aX = "dimensionalBagSecondaryGemPath";
    public static final String aY = "calendarEventPath";
    public static final String aZ = "lootTypeIconsPath";
    public static final String ba = "weatherIconsPath";
    public static final String bb = "windForceIconsPath";
    public static final String bc = "protectorBuffsIconsPath";
    public static final String bd = "nationFlagIconsPath";
    public static final String be = "nationSelectionIconsPath";
    public static final String bf = "challengeFlyingImagePath";
    public static final String bg = "lawFlyingImagePath";
    public static final String bh = "craftPassportIconsPath";
    public static final String bi = "passportStampIconsPath";
    public static final String bj = "emoteIconsPath";
    public static final String bk = "breedEmoteIconsPath";
    public static final String bl = "playerEmoteIconsPath";
    public static final String bm = "emotePath";
    public static final String bn = "monstersFamily";
    public static final String bo = "achievementCategoryPath";
    public static final String bp = "achievementPath";
    public static final String bq = "titlePath";
    public static final String br = "currencyIconUrl";
    public static final String bs = "backgroundDisplayPath";
    public static final String bt = "backgroundDisplayBackgroundPath";
    public static final String bu = "interactiveDialogPortraitPath";
    public static final String bv = "temperatureInfluenceIconUrl";
    public static final String bw = "protectorSecretIconUrl";
    public static final String bx = "effectDescPlotIconUrl";
    public static final String by = "giftTypeIconPath";
    public static final String bz = "zaapTypeIconPath";
    public static final String bA = "governmentRankIconPath";
    public static final String bB = "itemTypeIconPath";
    public static final String bC = "messageBoxIconsPath";
    public static final String bD = "guildStorageTypeIconsPath";
    public static final String bE = "antiAddictionIconsPath";
    public static final String bF = "pvpRankIconsPath";
    public static final String bG = "pvpRankPassportIconsPath";
    public static final String bH = "battlegroundTypeIcons";
    public static final String bI = "themeItemBorder";
    public static final String bJ = "themeBuildIcons";
    public static final String bK = "themeDungeonLadderCrowns";
    public static final String bL = "themeBattlegroundStates";
    public static final String bM = "themeDungeonLadderStasis";
    public static final String bN = "themeDungeonLadderLaurels";
    public static final String bO = "themeBreedDifficulty";
    public static final String bP = "themeRolesIcon";
    public static final String bQ = "themeRolesSelectIcon";
    public static final String bR = "boosterPrivilegeIcon";
    public static final String bS = "serverIllustrationPath";
    public static final String bT = "hwBuidingIconGreenPath";
    public static final String bU = "hwBuidingIconOrangePath";
    public static final String bV = "hwBuidingIconRedPath";
    public static final String bW = "characteristicsIconsPath";
    public static final String bX = "textIconsPath";
    public static final String bY = "activateMapParticles";
    public static final String bZ = "appSkinPath";
    public static final String ca = "themeDirectory";
    public static final String cb = "themeDescriptionFolder";
    public static final String cc = "tutorialFile";
    public static final String cd = "dayLightFile";
    public static final String ce = "defaultShortcutsFile";
    public static final String cf = "defaultChatFile";
    public static final String cg = "defaultDayLightFile";
    public static final String ch = "soundBankFile";
    public static final String ci = "reverbPresetFile";
    public static final String cj = "rollOffPresetFile";
    public static final String ck = "lowPassPresetFile";
    public static final String cl = "barksFile";
    public static final String cm = "groundsFile";
    public static final String cn = "mountsFile";
    public static final String co = "elementsFile";
    public static final String cp = "groupsFile";
    public static final String cq = "buildingFile";
    public static final String cr = "buildingImagePath";
    public static final String cs = "buildingImageOffsetFile";
    public static final String ct = "buildingMiniImagePath";
    public static final String cu = "partitionPatchFile";
    public static final String cv = "patchImagePath";
    public static final String cw = "patchImageOffsetFile";
    public static final String cx = "patchMiniImagePath";
    public static final String cy = "mapDefinitionPath";
    public static final String cz = "mapScrollDecoratorPath";
    public static final String cA = "fullSubMapPath";
    public static final String cB = "fullMapPath";
    public static final String cC = "completeMapPath";
    public static final String cD = "completeMapCoordsPath";
    public static final String cE = "miniMapPointFile";
    public static final String cF = "miniMapPointBigFile";
    public static final String cG = "compassPointFile";
    public static final String cH = "fightChallengeIconsPath";
    public static final String cI = "pointsOfInterestIconPath";
    public static final String cJ = "pointsOfInterestDefaultSmallIconPath";
    public static final String cK = "pointsOfInterestProtectorIconPath";
    public static final String cL = "pointsOfInterestProtectorinChaosIconPath";
    public static final String cM = "partyMemberPoiPath";
    public static final String cN = "highLightGfxDefaultFile";
    public static final String cO = "contentStaticDataStorageDirectory";
    public static final String cP = "binaryDataFile";
    public static final String cQ = "merchantDisplayIconPath";
    public static final String cR = "pictoIconPath";
    public static final String cS = "soundDevice";
    public static final String cT = "soundEnable";
    public static final String cU = "soundAmbianceEnable";
    public static final String cV = "amb2DMix";
    public static final String cW = "amb3DMix";
    public static final String cX = "guiMix";
    public static final String cY = "musicMix";
    public static final String cZ = "sfxMix";
    public static final String da = "fightsMix";
    public static final String db = "voicesMix";
    public static final String dc = "foleysMix";
    public static final String dd = "particlesMix";
    private static final String et = "dynamicSpellMixFadeOut";
    private static final String eu = "dynamicSpellMix";
    public static final String de = "connectionRetryCount";
    public static final String df = "connectionRetryDelay";
    public static final String dg = "dispatchAddresses";
    public static final String dh = "bugReport.enable";
    public static final String di = "bugReport.url";
    public static final String dj = "linkSteamAccountUrl";
    public static final String dk = "accountCreationUrl";
    public static final String dl = "forgottenPasswordUrl";
    public static final String dm = "accountValidationUrl";
    public static final String dn = "antiAddictionAccountCheckURL";
    public static final String do = "loginNewsURL";
    private static final String ev = "http://www.google.fr";
    public static final String dp = "cacheDirectory";
    public static final String dq = "autoLogin";
    public static final String dr = "autoLogin_login";
    public static final String ds = "autoLogin_password";
    public static final String dt = "autoLogin_selectCharacter";
    public static final String du = "autopassword";
    public static final String dv = "climateBonusIconsPath";
    public static final String dw = "worldMapAnmFilePath";
    public static final String dx = "bannerAnmFilePath";
    public static final String dy = "bannerImageFilePath";
    public static final String dz = "bannerImageLocalizedFilePath";
    public static final String dA = "fightBannerAnmFilePath";
    public static final String dB = "compassTypePath";
    public static final String dC = "dialogChoiceTypePath";
    public static final String dD = "rewardTypeIconsPath";
    public static final String dE = "language.force";
    public static final String dF = "shopBuyOgrinesUrl";
    public static final String dG = "shopServices";
    public static final String dH = "haapiAnkamaUrl";
    public static final String dI = "haapiWakfuUrl";
    public static final String dJ = "shopiUrl";
    public static final String dK = "interChatUrl";
    public static final String dL = "tutorialIconsPath";
    public static final String dM = "guideIconsPath";
    public static final String dN = "guideIllustrationsPath";
    public static final String dO = "nationLawsIconsPath";
    public static final String dP = "characterCreation.tuto.force";
    public static final String dQ = "resolution.min.width";
    public static final String dR = "resolution.min.height";
    public static final String dS = "enableRandomCharacterName";
    public static final String dT = "activateStuffPreview";
    public static final String dU = "companionCharacterSheetIllustrationPath";
    public static final String dV = "companionBigCharacterSheetIllustrationPath";
    public static final String dW = "companionIconsPath";
    public static final String dX = "companionListIllustrationsPath";
    public static final String dY = "companionSpellInventoryIllustrationsPath";
    public static final String dZ = "companionCircleIllustrationPath";
    public static final String ea = "UPDATER_COMMUNICATION_PORT";
    public static final String eb = "UPDATER_INITIAL_STATE";
    public static final String ec = "cgvUrl";
    public static final String ed = "payementHandleUrl";
    public static final String ee = "payementOgrinesHandleUrl";
    public static final String ef = "branch";
    public static final String eg = "loadAchievements";
    public static final String eh = "loadGameEvents";
    public static final String ei = "dontAskForTuto";
    public static final String ej = "disableCharacterManagement";
    public static final String ek = "disableTacticalView";
    public static final String el = "useLuaCache";
    public static final String em = "onStartupClientBenchmark";
    public static final String en = "onStartupClientHardwareTest";
    public static final String eo = "gameRequirements.url";
    public static final String ep = "nameForced";
    private static final azs_0 ew = new azs_0();
    public static final String eq = ".xps";
    private final THashSet<String> ex = new THashSet();

    public static azs_0 a() {
        return ew;
    }

    public String b() {
        return this.a(n, "");
    }

    public boolean c() {
        return this.i("");
    }

    @Override
    public boolean i(String string) {
        es.info((Object)String.format("Chargement de la configuration depuis le fichier : '%s'", string));
        return super.i(Strings.isNullOrEmpty((String)string) ? a : string);
    }

    public float d() {
        return Math.min(1.0f, Math.max(0.0f, this.a(dc, 100.0f) / 100.0f));
    }

    public float e() {
        return Math.min(1.0f, Math.max(0.0f, this.a(dd, 100.0f) / 100.0f));
    }

    public float f() {
        return Math.min(1.0f, Math.max(0.0f, this.a(cZ, 100.0f) / 100.0f));
    }

    public float g() {
        return Math.min(1.0f, Math.max(0.0f, this.a(cV, 100.0f) / 100.0f));
    }

    public float h() {
        return Math.min(1.0f, Math.max(0.0f, this.a(cW, 100.0f) / 100.0f));
    }

    public float i() {
        return Math.min(1.0f, Math.max(0.0f, this.a(da, 100.0f) / 100.0f));
    }

    public float j() {
        return Math.min(1.0f, Math.max(0.0f, this.a(cX, 100.0f) / 100.0f));
    }

    public float k() {
        return Math.min(1.0f, Math.max(0.0f, this.a(cY, 100.0f) / 100.0f));
    }

    public float l() {
        return Math.min(1.0f, Math.max(0.0f, this.a(db, 100.0f) / 100.0f));
    }

    public float m() {
        return this.a(et, 1.0f);
    }

    public float n() {
        return Math.min(1.0f, Math.max(0.0f, this.a(eu, 100.0f) / 100.0f));
    }

    @Nullable
    public String a(int n) {
        try {
            return this.a(Z) + n + eq;
        }
        catch (gm_0 gm_02) {
            es.warn((Object)gm_02);
            return null;
        }
    }

    @Nullable
    public String a(String string, String string2, Object ... objectArray) {
        try {
            String string3 = gg_0.a(this.a(string), objectArray);
            if (string3 != null && cd_0.b(string3)) {
                return string3;
            }
            if (!this.ex.contains((Object)string3)) {
                es.warn((Object)("Impossible de trouver l'icone d'URL " + string3));
                this.ex.add((Object)string3);
            }
            if (string2 != null) {
                return azs_0.z(string2);
            }
            return null;
        }
        catch (gm_0 gm_02) {
            es.warn((Object)gm_02.getMessage());
            return null;
        }
    }

    public boolean a(String string, Object ... objectArray) {
        try {
            String string2 = gg_0.a(this.a(string), objectArray);
            return string2 != null && cd_0.b(string2);
        }
        catch (gm_0 gm_02) {
            es.warn((Object)("Unable to read icon with key " + string + " and args " + Arrays.toString(objectArray)), (Throwable)gm_02);
            return false;
        }
    }

    public String b(int n) {
        return this.a(aH, aK, n);
    }

    public String c(int n) {
        return this.a(aI, aJ, n);
    }

    public String a(int n, int n2) {
        try {
            return String.format(azs_0.a().a(aF), n, n2);
        }
        catch (gm_0 gm_02) {
            return null;
        }
    }

    public String d(int n) {
        return this.a(ak, ab, n);
    }

    public boolean e(int n) {
        return this.a(ak, new Object[]{n});
    }

    public String f(int n) {
        return this.a(ak, ab, n);
    }

    public String g(int n) {
        return this.a(ac, ab, n);
    }

    public String h(int n) {
        return this.a(ac, ab, n);
    }

    public String i(int n) {
        return this.a(aN, ab, "c" + n);
    }

    public String j(int n) {
        return this.i(n);
    }

    public String k(int n) {
        return this.a(aN, ab, n);
    }

    public String l(int n) {
        return this.a(aV, ab, n);
    }

    public String a(byte by) {
        return this.a(aY, ab, by);
    }

    public String m(int n) {
        return this.a(bd, ab, n);
    }

    public String n(int n) {
        return this.a(be, ab, n);
    }

    public String o(int n) {
        return this.a(dC, ab, n);
    }

    public String p(int n) {
        return this.a(bj, null, n);
    }

    public String q(int n) {
        return this.a(bk, null, n);
    }

    public String l(String string) {
        return this.a(bl, null, string);
    }

    public String m(String string) {
        return this.a(bI, null, string);
    }

    public String n(String string) {
        return this.a(bJ, null, string);
    }

    public String o(String string) {
        return this.a(bH, null, string);
    }

    public String p(String string) {
        return this.a(bP, null, string);
    }

    public String o() {
        return this.a(bQ, null, new Object[0]);
    }

    public String q(String string) {
        return this.a(bK, null, string);
    }

    public String r(String string) {
        return this.a(bL, null, string);
    }

    public String s(String string) {
        return this.a(bM, null, string);
    }

    public String t(String string) {
        return this.a(bN, null, string);
    }

    public String u(String string) {
        return this.a(bO, null, string);
    }

    public String r(int n) {
        return this.a(bm, null, n);
    }

    public String s(int n) {
        return this.a(bo, null, n);
    }

    public String t(int n) {
        return this.a(bp, null, n);
    }

    public String u(int n) {
        return this.a(bq, null, new Object[0]);
    }

    public String v(int n) {
        return this.a(bs, null, n);
    }

    public String w(int n) {
        return this.a(bt, null, n);
    }

    public String v(String string) {
        return this.a(bu, null, string);
    }

    public String w(String string) {
        return this.a(dL, null, string);
    }

    public String x(int n) {
        return this.a(dM, null, n);
    }

    public String x(String string) {
        return this.a(dN, null, string);
    }

    public String a(long l) {
        return this.a(dO, null, l);
    }

    public String a(short s2) {
        return this.a(bB, null, s2);
    }

    public String b(int n, int n2) {
        return this.a(bR, null, n, n2);
    }

    @Nullable
    public URL p() {
        String string;
        try {
            string = this.a(do);
        }
        catch (gm_0 gm_02) {
            string = ev;
        }
        if (string == null) {
            return null;
        }
        String string2 = bae.h().f().i();
        String string3 = String.format(string, string2);
        try {
            return gg_0.d(string3);
        }
        catch (MalformedURLException malformedURLException) {
            es.error((Object)"While get loginNewsUrl", (Throwable)malformedURLException);
            return null;
        }
    }

    @Nullable
    public String q() {
        try {
            return String.format(this.a(eo), bae.h().f().j());
        }
        catch (gm_0 gm_02) {
            es.error((Object)"Unable to retrieve url of game requirements.", (Throwable)gm_02);
            return null;
        }
    }

    public String y(String string) {
        String string2;
        try {
            string2 = this.a(dp) + File.separatorChar + string;
        }
        catch (gm_0 gm_02) {
            string2 = "./cache/" + string;
        }
        return string2;
    }

    public static String z(String string) {
        return gg_0.e(azs_0.a().a(string));
    }

    public static String b(String string, Object ... objectArray) {
        String string2 = String.format(azs_0.a().a(string), objectArray);
        return gg_0.e(string2);
    }

    public boolean r() {
        String string = this.a(eb, (String)null);
        return "uptodate".equalsIgnoreCase(string);
    }

    public ArrayList<QP> s() {
        ArrayList<QP> arrayList = new ArrayList<QP>();
        try {
            String string = this.a(dg);
            String[] stringArray = string.split(":");
            if (stringArray.length == 2) {
                String string2 = stringArray[0];
                String[] stringArray2 = stringArray[1].split(";");
                for (int k = 0; k < stringArray2.length; ++k) {
                    arrayList.add(new QP(string2, Integer.parseInt(stringArray2[k])));
                }
            }
        }
        catch (gm_0 gm_02) {
            es.error((Object)"PropertyException during getDispatchAddresses", (Throwable)gm_02);
        }
        return arrayList;
    }
}

