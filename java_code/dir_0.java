/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.THashSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from diR
 */
public class dir_0
extends akr_1 {
    static final Logger a = Logger.getLogger(dir_0.class);
    static final akf_1[] e = new akf_1[]{new akf_1("dialogId", "Id du dialogue", akg_2.d, false), new akf_1("sourceType", "1 pour protecteur, 2 pour NPC", akg_2.d, false), new akf_1("sourceId", "L'id de la source (pour le protecteur, il ne s'agit pas du groupe de monstre associ?)", akg_2.b, false)};
    static final akf_1[] f = new akf_1[]{new akf_1("landMarkId", "Id de la note", akg_2.d, false)};
    static final akf_1[] g = new akf_1[]{new akf_1("achievementId", "Id de l'achievement", akg_2.d, false), new akf_1("follow", "Active le suivi (true | false)", akg_2.f, false)};
    static final akf_1[] h = new akf_1[]{new akf_1("popupOnEscape", "Press echap call the callFunction", akg_2.f, false), new akf_1("escapeTranslationKey", "Translation key displayed on the popup (if popupOnEscape = true)", akg_2.c, true), new akf_1("buttonTranslationKey", "Translation key displayed on the button", akg_2.c, true), new akf_1("callFunction", "Called method when button or escape (if popupOnEscape = true) are pressed", akg_2.c, true), new akf_1("params", "callFunction parameters", akg_2.h, true)};
    static final akf_1[] i = new akf_1[]{new akf_1("translationKey", "Cl? de traduction", akg_2.c, false), new akf_1("gfxId", "Id de l'icone", akg_2.d, false), new akf_1("worldX", "Position x", akg_2.d, false), new akf_1("worldY", "Position y", akg_2.d, false), new akf_1("worldZ", "Position z", akg_2.d, true), new akf_1("toClean", "Remove landmark when client closing", akg_2.f, true)};
    static final akf_1[] j = new akf_1[]{new akf_1("titleTranslationKey", "Clef de traduction du titre", akg_2.c, false), new akf_1("textTranslationKey", "Clef de traduction du texte", akg_2.c, false)};
    static final akf_1[] k = new akf_1[]{new akf_1("positive", "true affiche un +1, false affiche un -1", akg_2.f, true)};
    static final akf_1[] l = new akf_1[]{new akf_1("landMarkId", "Id de la note", akg_2.d, false)};
    static final akf_1[] m = new akf_1[]{new akf_1("frescoId", "Id de la fresque", akg_2.d, false)};
    static final akf_1[] n = new akf_1[]{new akf_1("duration", "Dur?e du compte ? rebours", akg_2.d, false), new akf_1("startDate", "Date de d?part du compte ? rebours (date courante si non renseign?)", akg_2.b, true)};
    static final akf_1[] o = new akf_1[]{new akf_1("fighterId", "Id du fighter", akg_2.d, false), new akf_1("activated", "s?lectionne si true, d?selectionne si false", akg_2.f, false)};
    static final akf_1[] p = new akf_1[]{new akf_1("duration", "Dur?e du d?compte (en secondes)", akg_2.e, false), new akf_1("decrement", "Interval entre deux 'tic' de countdown", akg_2.e, true)};
    static final akf_1[] q = new akf_1[]{new akf_1("message", "Message ? afficher", akg_2.c, true), new akf_1("duration", "Dur?e d'affichage du message", akg_2.e, false)};
    static final akf_1[] r = new akf_1[]{new akf_1("elementId", "Id de l'?l?ment interactif sur lequel on ouvre le MRU", akg_2.b, false), new akf_1("eventId", "Id de l'?v?nement LUA g?n?r? par l'activation du MRU", akg_2.d, false), new akf_1("gfxId", "gfxId de l'action de MRU", akg_2.d, false)};
    static final akf_1[] s = new akf_1[]{new akf_1("interactiveElementId", "Id de l'?l?ment interactif sur lequel on ouvre le MRU", akg_2.e, false)};
    static final akf_1[] t = new akf_1[]{new akf_1("skillVisualId", "Id de l'action", akg_2.e, false), new akf_1("usable", "Utilisable ou non", akg_2.f, false)};
    static final akf_1[] u = new akf_1[]{new akf_1("actionId", "Id de l'action", akg_2.e, false), new akf_1("usable", "Utilisable ou non", akg_2.f, false)};
    static final akf_1[] v = new akf_1[]{new akf_1("charaCcterId", "Id du personnage concern?", akg_2.b, false), new akf_1("actionId", "Id de l'action MRU", akg_2.e, false), new akf_1("onlyOnce", "Sp?cifie qu'on ajoutera pas le MRU s'il existe d?j? un avec le m?me id d'action sur ce personnage", akg_2.f, true)};
    static final akf_1[] w = new akf_1[]{new akf_1("characterId", "Id du personnage concern?", akg_2.b, false), new akf_1("actionId", "Id de l'action MRU concern?e", akg_2.e, false)};
    static final akf_1[] x = new akf_1[]{new akf_1("trainingActionIndex", "Id de l'action MRU concern?e", akg_2.d, false), new akf_1("shouldTeleport", "Indique si les fighters doivent ?tre t?l?port?s dans le combat ou pas", akg_2.f, false), new akf_1("fightType", "Indique le type de combat (pvp=1,pve=2,tuto=3,etc..cf FightModel)", akg_2.d, false), new akf_1("hasBorders", "Indique si le combat doit avoir des bordures", akg_2.f, false), new akf_1("battlegroundType", "Indique le type de bordure du combat", akg_2.d, false), new akf_1("bgParams", "Pattern du battleground", akg_2.h, true)};
    static final akf_1[] y = new akf_1[]{new akf_1("trainingActionIndex", "Id de l'action MRU concern?e", akg_2.d, false), new akf_1("bgX", "x de la position centre du battleground", akg_2.d, false), new akf_1("bgY", "y de la position centre du battleground", akg_2.d, false), new akf_1("bgZ", "z de la position centre du battleground", akg_2.d, false)};
    static final akf_1[] z = new akf_1[]{new akf_1("trainingActionIndex", "Id de l'action MRU concern?e", akg_2.d, false), new akf_1("attackerX", "x de la position de d?part des attaquants", akg_2.d, false), new akf_1("attackerY", "y de la position de d?part des attaquants", akg_2.d, false), new akf_1("attackerZ", "z de la position de d?part des attaquants", akg_2.d, false), new akf_1("defenderX", "x de la position de d?part des d?fenseurs", akg_2.d, false), new akf_1("defenderY", "y de la position de d?part des d?fenseurs", akg_2.d, false), new akf_1("defenderZ", "z de la position de d?part des d?fenseurs", akg_2.d, false)};
    static final akf_1[] A = new akf_1[]{new akf_1("frame", "Frame ? activer", akg_2.c, false), new akf_1("push", "Active ou desactive la frame", akg_2.f, false)};
    static final akf_1[] B = new akf_1[]{new akf_1("dialog", "Nom du dialogue", akg_2.c, false), new akf_1("id", "Nom du widget", akg_2.c, false), new akf_1("eventType", "Type d'?v?nement", akg_2.c, false), new akf_1("funcName", "Fonction ? appeler", akg_2.c, false), new akf_1("params", "Param?tres de la fonction ? appeler", akg_2.h, true)};
    static final akf_1[] C = new akf_1[]{new akf_1("dialog", "Nom du dialogue", akg_2.c, false), new akf_1("id", "Nom du widget", akg_2.c, false), new akf_1("eventType", "Type d'evenement", akg_2.c, false), new akf_1("funcName", "Fonction qui devait ?tre appel?e", akg_2.c, false)};
    static final akf_1[] D = new akf_1[]{new akf_1("dialog", "Nom du dialoque", akg_2.c, false), new akf_1("id", "Nom du widget", akg_2.c, false), new akf_1("button", "Bouton de la souris enfonc?", akg_2.e, true), new akf_1("clickCount", "Nombre de click", akg_2.e, true)};
    static final akf_1[] E = new akf_1[]{new akf_1("dialog", "Nom du dialogue", akg_2.c, false), new akf_1("id", "Nom du widget", akg_2.c, false), new akf_1("enable", "Activation", akg_2.f, false)};
    static final akf_1[] F = new akf_1[]{new akf_1("dialog", "Nom du dialogue", akg_2.c, false), new akf_1("id", "Nom du wdget", akg_2.c, false), new akf_1("eventType", "Type d'?v?nement", akg_2.c, false), new akf_1("enable", "Activation", akg_2.f, false)};
    static final akf_1[] G = new akf_1[]{new akf_1("fileName", "Nom du fichier ? ouvrir", akg_2.c, false), new akf_1("linkageName", "Nom de l'anim ? jouer dans l'interface", akg_2.c, false), new akf_1("align", "Alignement de la fenetre", akg_2.c, false), new akf_1("screenXoffset", "D?calage en pixel vers la droite", akg_2.d, false), new akf_1("screenYoffset", "D?calage en pixel vers le haut", akg_2.d, false)};
    static final akf_1[] H = new akf_1[]{new akf_1("id", "Id de la fenetre d'interface", akg_2.d, false), new akf_1("animName", "Nom de l'animation ? jouer", akg_2.c, false)};
    static final akf_1[] I = new akf_1[]{new akf_1("id", "Id de la fenetre d'interface", akg_2.d, false)};
    static final akf_1[] J = new akf_1[]{new akf_1("dialog", "Nom de la fenetre ? ouvrir", akg_2.c, false)};
    static final akf_1[] K = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false)};
    static final akf_1[] L = new akf_1[]{new akf_1("dialogName", "Dialog name", akg_2.c, false)};
    static final akf_1[] M = new akf_1[]{new akf_1("dialogName", "Dialog name", akg_2.c, false)};
    static final akf_1[] N = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("movable", "V?rouill?", akg_2.f, false)};
    static final akf_1[] O = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("widgetId", "Nom du widget", akg_2.c, false), new akf_1("enabled", "Activation", akg_2.f, false)};
    static final akf_1[] P = new akf_1[]{new akf_1("propertyName", "Nom de la propri?t?", akg_2.c, false), new akf_1("value", "Valeur", akg_2.f, false)};
    static final akf_1[] Q = new akf_1[]{new akf_1("propertyName", "Nom de la propri?t?", akg_2.c, false), new akf_1("value", "Valeur", akg_2.c, false)};
    static final akf_1[] R = new akf_1[]{new akf_1("propertyName", "Nom de la propri?t?", akg_2.c, false), new akf_1("dialogId", "Nom de la dialog", akg_2.c, false), new akf_1("value", "Valeur", akg_2.c, false)};
    static final akf_1[] S = new akf_1[]{new akf_1("propertyName", "Nom de la propri?t?", akg_2.c, false)};
    static final akf_1[] T = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("widgetId", "Nom du wodget", akg_2.c, false), new akf_1("propertyName", "Nom de la propri?t? concern?e", akg_2.c, false), new akf_1("local", "True s'il s'agit d'une propri?t? locale (propre ? un dialog)", akg_2.f, true)};
    static final akf_1[] U = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("propertyName", "Nom de la propri?t?", akg_2.c, false), new akf_1("field", "Champ de la propri?t?", akg_2.c, false), new akf_1("local", "True s'il s'agit d'une propri?t? locale (propre ? un dialog)", akg_2.f, true)};
    static final akf_1[] V = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("widgetId", "Nom du widget", akg_2.c, false), new akf_1("visible", "Visibilit?", akg_2.f, false)};
    static final akf_1[] W = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("widgetId", "Nom du widget", akg_2.c, false), new akf_1("blocking", "true bloque, false ne bloque pas", akg_2.f, false)};
    static final akf_1[] X = new akf_1[]{new akf_1("dialogName", "Nom du dialog", akg_2.c, false), new akf_1("listId", "Id de la liste", akg_2.c, false), new akf_1("subId", "Id de l'?l?ment concern? dans la liste", akg_2.c, false), new akf_1("duration", "Dur?e de tween", akg_2.e, false), new akf_1("repeat", "Nombre de r?p?titions du tween (-1 pour infinie)", akg_2.e, false), new akf_1("r1", "Valeur rouge de d?part (blanc vers gris si non renseign?)", akg_2.e, true), new akf_1("g1", "Valeur vert de d?part (blanc vers gris si non renseign?)", akg_2.e, true), new akf_1("b1", "Valeur bleu de d?part (blanc vers gris si non renseign?)", akg_2.e, true), new akf_1("a1", "Valeur alpha de d?part (blanc vers gris si non renseign?)", akg_2.e, true), new akf_1("r2", "Valeur rouge de fin (blanc vers gris si non renseign?)", akg_2.e, true), new akf_1("g2", "Valeur vert de fin (blanc vers gris si non renseign?)", akg_2.e, true), new akf_1("b2", "Valeur bleu de fin (blanc vers gris si non renseign?)", akg_2.e, true), new akf_1("a2", "Valeur alpha de fin (blanc vers gris si non renseign?)", akg_2.e, true)};
    static final akf_1[] Y = new akf_1[]{new akf_1("dialogName", "Nom du dialog", akg_2.c, false), new akf_1("widgetId", "Id de la liste", akg_2.c, false), new akf_1("subId", "Id de l'?l?ment concern? dans la liste", akg_2.c, false)};
    static final akf_1[] Z = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("widgetId", "Nom du widget", akg_2.c, false), new akf_1("duration", "Temps du cycle du tween (en ms)", akg_2.e, false), new akf_1("repeat", "Nombre de cycles du tween (-1 = infini)", akg_2.e, false), new akf_1("r1", "Teinte 1 rouge", akg_2.e, true), new akf_1("g1", "Teinte 1 vert", akg_2.e, true), new akf_1("b1", "Teinte 1 bleu", akg_2.e, true), new akf_1("a1", "Teinte 1 alpha", akg_2.e, true), new akf_1("r2", "Teinte 2 rouge", akg_2.e, true), new akf_1("g2", "Teinte 2 vert", akg_2.e, true), new akf_1("b2", "Teinte 2 bleu", akg_2.e, true), new akf_1("a2", "Teinte 2 alpha", akg_2.e, true)};
    static final akf_1[] aa = new akf_1[]{new akf_1("dialogName", "Nom du dialogue", akg_2.c, false), new akf_1("widgetId", "Nom du widget", akg_2.c, false)};
    static final akf_1[] ab = new akf_1[]{new akf_1("particleId", "Id de l'APS", akg_2.d, false), new akf_1("time", "Temps avant disparition (en ms)", akg_2.d, true)};
    static final akf_1[] ac = new akf_1[]{new akf_1("dialogId", "Id de l'interface", akg_2.c, false), new akf_1("widgetId", "Id du widget", akg_2.c, false)};
    static final akf_1[] ad = new akf_1[]{new akf_1("cursorState", "Etat du curseur", akg_2.c, false)};
    static final akf_1[] ae = new akf_1[]{new akf_1("cursorState", "Ancien ?tat du curseur", akg_2.c, false)};
    static final akf_1[] af = new akf_1[]{new akf_1("show/hide", "Affiche ou masque les bandes", akg_2.f, false), new akf_1("percentOfScreen", "Pourcentage de l'?cran en noir", akg_2.d, true), new akf_1("duration", "Temps de transition (en ms)", akg_2.d, true)};
    static final akf_1[] ag = new akf_1[]{new akf_1("referenceType", "Le type de param?tre qui d?finira l'objet (Pos,UID, refid)", akg_2.c, false), new akf_1("itemReference", "Suivant refType, soit la position, soit l'UID, soit l'id de reference", akg_2.b, false), new akf_1("position", "Position ? laquelle le raccourci doit ?tre ajout? dans la barre", akg_2.d, true)};
    static final akf_1[] ah = new akf_1[]{new akf_1("emoteId", "Id de l'emote concern?e", akg_2.d, false), new akf_1("position", "Position dans la barre de raccourci d'item courante (premi?re place libre si non renseign?)", akg_2.d, true)};
    static final akf_1[] ai = new akf_1[]{new akf_1("referenceId", "Id r?f?rent de l'?l?ment qu'on souhaite enlever", akg_2.d, false), new akf_1("shortcutType", "Typde de la barre de raccourci concern?e (0: spell, 2: item, 3: slot)", akg_2.d, false)};
    static final akf_1[] aj = new akf_1[]{new akf_1("positionId", "position of the shortcut", akg_2.d, false), new akf_1("barNumber", "bar number", akg_2.d, false)};
    static final akf_1[] ak = new akf_1[]{new akf_1("referenceType", "Le type de param?tre qui d?finira l'objet (UID, refid)", akg_2.c, false), new akf_1("itemReference", "Suivant refType, soit la position, soit l'UID, soit l'id de reference", akg_2.b, false), new akf_1("position", "Position ? laquelle le raccourci doit ?tre ajout? dans la barre", akg_2.d, true)};
    static final akf_1[] al = new akf_1[]{new akf_1("referenceType", "Le type de r?f?rence d'item en param2 (uid=l'unique id de l'item,refId=le refId de l'item)", akg_2.c, false), new akf_1("itemReference", "Id ou refId de l'item", akg_2.b, false), new akf_1("position", "Position dans la barre courante (premi?re position livre si non renseign?)", akg_2.d, true)};
    static final akf_1[] am = new akf_1[]{new akf_1("hasShortcut", "true si on trouve un raccourci, false sinon", akg_2.f, false)};
    static final akf_1[] an = new akf_1[]{new akf_1("referenceId", "Id r?f?rent de l'?l?ment qu'on souhaite v?rifier", akg_2.d, true), new akf_1("shortcutType", "Typde de la barre de raccourci concern?e (0: spell, 2: item, 3: slot)", akg_2.d, true)};
    static final akf_1[] ao = new akf_1[]{new akf_1("hasShortcut", "true si on trouve un raccourci, false sinon", akg_2.f, false)};
    static final akf_1[] ap = new akf_1[]{new akf_1("referenceId", "Id r?f?rent de l'?l?ment qu'on souhaite v?rifier", akg_2.d, true), new akf_1("shortcutType", "Typde de la barre de raccourci concern?e (0: spell, 2: item, 3: slot)", akg_2.d, true)};
    static final akf_1[] aq = new akf_1[]{new akf_1("hasShortcut", "true si on trouve un raccourci, false sinon", akg_2.f, false)};
    static final akf_1[] ar = new akf_1[]{new akf_1("referenceId", "Id r?f?rent de l'?l?ment qu'on souhaite v?rifier", akg_2.d, true), new akf_1("shortcutType", "Typde de la barre de raccourci concern?e (0: spell, 2: item, 3: slot)", akg_2.d, true)};
    static final akf_1[] as = new akf_1[]{new akf_1("usable", "Active si true, d?sactive si false", akg_2.f, false), new akf_1("shortCutBarType", "Type de barre de raccourci concern?e (HANDS, HANDS_AND_FIGHT, FIGHT ou WORLD, toutes les barres si non renseign?)", akg_2.c, true), new akf_1("barIndex", "Indice de la barre concern?e", akg_2.d, true), new akf_1("position", "Position dans la barre du raccourci concern?", akg_2.d, true)};
    static final akf_1[] at = new akf_1[]{new akf_1("dialog", "Nom du dialogue", akg_2.c, false), new akf_1("funcName", "Fonction ? appeler", akg_2.c, false), new akf_1("params", "Param?tres de la fonction ? appaler", akg_2.h, true)};
    static final akf_1[] au = new akf_1[]{new akf_1("dialog", "Nom de l'interface", akg_2.c, true), new akf_1("widget", "Nom du widget de l'interface", akg_2.c, true)};
    static final akf_1[] av = new akf_1[]{new akf_1("dialog", "Nom du dialogue", akg_2.c, false)};
    static final akf_1[] aw = new akf_1[]{new akf_1("dialog", "Nom du dialogue", akg_2.c, false), new akf_1("funcName", "Fonction a appeler", akg_2.c, false), new akf_1("params", "Parametres de la fonction a appeler", akg_2.h, true)};
    static final akf_1[] ax = new akf_1[]{new akf_1("dialog", "Nom du dialogue", akg_2.c, false)};
    static final akf_1[] ay = new akf_1[]{new akf_1("enabled", "Activation", akg_2.f, false), new akf_1("groupName", "Nom du groupe", akg_2.c, true), new akf_1("name", null, akg_2.c, true)};
    static final akf_1[] az = new akf_1[]{new akf_1("visible", "true visible, false invisible", akg_2.f, false)};
    static final akf_1[] aA = new akf_1[]{new akf_1("message", "La clef de traduction suivie d'?ventuels param?tres", akg_2.h, true)};
    static final akf_1[] aB = new akf_1[]{new akf_1("message", "La clef de traduction", akg_2.c, false), new akf_1("params", "Les param?tres ?ventuels du message", akg_2.h, true)};
    static final akf_1[] aC = new akf_1[]{new akf_1("channel", "Chat pipe", akg_2.d, false), new akf_1("messageKey", "Clef de traduction", akg_2.c, false), new akf_1("keyParams", "Param\u00e8tre de la clef de trad", akg_2.h, true)};
    static final akf_1[] aD = new akf_1[]{new akf_1("x", "x de la position du marqueur dans le monde", akg_2.d, false), new akf_1("y", "y de la position du marqueur dans le monde", akg_2.d, false), new akf_1("z", "z de la position du marqueur dans le monde", akg_2.d, false), new akf_1("pointId", "Obsol?te", akg_2.d, false)};
    static final akf_1[] aE = new akf_1[]{new akf_1("pointId", "Obsol?te", akg_2.d, false)};
    static final akf_1[] aF = new akf_1[]{new akf_1("smileyId", "Id du smiley", akg_2.d, false), new akf_1("mobileId", "Id du mobile concern?", akg_2.b, false), new akf_1("familyId", "S'il s'agit d'un smiley de monstre, id de la famille de monstre", akg_2.d, true)};
    static final akf_1[] aG = new akf_1[0];
    static final akf_1[] aH = new akf_1[]{new akf_1("protectorId", "L'id du protecteur statique", akg_2.d, false)};
    static final akf_1[] aI = new akf_1[]{new akf_1("monster", null, akg_2.f, false), new akf_1("familyId", null, akg_2.d, false), new akf_1("minValue", null, akg_2.d, false), new akf_1("maxValue", null, akg_2.d, false)};
    static final akf_1[] aJ = new akf_1[]{new akf_1("iconUrl", "Url de l'image ? afficher", akg_2.c, false)};
    static final akf_1[] aK = new akf_1[]{new akf_1("anmUrl", "Url du fichier anm (relatif \u00e0 la racine du dossier gui)", akg_2.c, false), new akf_1("anmDir", "Direction de l'animation", akg_2.d, false), new akf_1("anmName", "Nom de l'animation", akg_2.c, false), new akf_1("duration", "dur\u00e9e du splash", akg_2.d, false)};
    static final akf_1[] aL = new akf_1[]{new akf_1("result", "true si l'interface est verouill?e, false sinon", akg_2.f, false)};
    static final akf_1[] aM = new akf_1[]{new akf_1("dialogName", "Nom du dialog", akg_2.c, false)};
    static final akf_1[] aN = new akf_1[]{new akf_1("result", "True si le dialog ouvert, false sinon", akg_2.f, false)};
    static final akf_1[] aO = new akf_1[]{new akf_1("messageParamCount", "Nombre de param?tres dans le message", akg_2.d, false), new akf_1("message", "Clef de traduction du message", akg_2.h, false), new akf_1("blocking", "Le message ne peut pas se fermer au clic", akg_2.f, false), new akf_1("displayTime", "Dur?e d'affichage du message (dynamique en fonction du message si non renseign?)", akg_2.d, true), new akf_1("funcName", "Fonctione ? appeler quand on ferme la bulle de dialogue", akg_2.c, true), new akf_1("params", "Les param?tres ?ventuels du message", akg_2.h, true)};
    static final akf_1[] aP = new akf_1[]{new akf_1("displayId", "Id du background", akg_2.d, false)};
    static final akf_1[] aQ = new akf_1[]{new akf_1("position", "Position du groupe de joueurs sur le podium", akg_2.d, false)};
    static final akf_1[] aR = new akf_1[]{new akf_1("text", "Clef de traduction du message", akg_2.c, false), new akf_1("params", "Les param?tres ?ventuels du message", akg_2.h, true)};
    static final akf_1[] aS = new akf_1[]{new akf_1("blocking", "True emp?che la s?lection effective du sort, false sinon", akg_2.f, false), new akf_1("funcName", "Nom de la fonction ? appeler quand un sort est s?lectionn?", akg_2.c, false), new akf_1("params", "Parma?tres ?ventuels de la fonction appel?e quand un sort est s?lectionn?", akg_2.h, true)};
    static final akf_1[] aT = new akf_1[]{new akf_1("funcName", "Nom de la fonction qui ?coute la s?lection d'un sort", akg_2.c, false)};
    static final akf_1[] aU = new akf_1[]{new akf_1("funcName", "La fonction ? appeler quand le niveau de d?tail du jeu change", akg_2.c, false)};
    static final akf_1[] aV = new akf_1[]{new akf_1("lodLevel", "Le niveau de d?tails actuel du jeu (0,1 ou 2)", akg_2.d, false)};
    static final akf_1[] aW = new akf_1[]{new akf_1("Nom", "Nom (inutilis?)", akg_2.c, false), new akf_1("x", "Position x", akg_2.e, false), new akf_1("y", "Position y", akg_2.e, false), new akf_1("z", "Position z", akg_2.e, true), new akf_1("type", "Le type de boussole (pour l'icone). Valeurs accept?es : 0 (personnage), 1 (havre-sac), 2 (autres), 3 (challenges), 6 (protecteurs)", akg_2.e, true)};
    static final akf_1[] aX = new akf_1[]{new akf_1("compassId", "Id de la boussole", akg_2.b, false)};
    static final akf_1[] aY = new akf_1[]{new akf_1("id", "Id de la boussole", akg_2.b, false)};
    static final akf_1[] aZ = new akf_1[]{new akf_1("translationKey", "Clef de traduction du texte ? afficher", akg_2.c, true), new akf_1("params", "Les param?tres ?ventuels du message", akg_2.h, true)};
    static final akf_1[] ba = new akf_1[]{new akf_1("titleTranslationKey", "Clef de trad du titre du popup", akg_2.c, false), new akf_1("translationKey", "Clef de trad du texte du popup", akg_2.c, false), new akf_1("params", "Params du texte du popup", akg_2.h, true)};
    static final akf_1[] bb = new akf_1[]{new akf_1("item", "RefId de l'item offert", akg_2.e, false), new akf_1("translationKey", "clef de traduction du texte de la r?compense", akg_2.c, true), new akf_1("params", "Les param?tres ?ventuels du texte", akg_2.h, true)};
    static final akf_1[] bc = new akf_1[]{new akf_1("iconName", "Nom de l'image ? afficher (cf dossier tutorial dans les assets)", akg_2.c, false), new akf_1("titleTranslationKey", "clef de traduction du titre du tuto", akg_2.c, false), new akf_1("descriptionTranslationKey", "clef de traduction du texte du tuto", akg_2.c, false), new akf_1("type", "Type de message d'info : (0=tuto, 1=tips, ...)", akg_2.d, true), new akf_1("params", "Les param?tres ?ventuels du texte", akg_2.h, true)};
    static final akf_1[] bd = new akf_1[]{new akf_1("guideId", "Id du guide \u00e0 afficher", akg_2.d, true)};
    static final akf_1[] be = new akf_1[]{new akf_1("activate", "Active ou desactive le dialog", akg_2.f, false)};
    static final akf_1[] bf = new akf_1[]{new akf_1("spellId", null, akg_2.d, false)};
    static final akf_1[] bg = new akf_1[]{new akf_1("slotId", "Slot id", akg_2.d, false), new akf_1("barId", "Bar id", akg_2.d, false)};
    static final akf_1[] bh = new akf_1[]{new akf_1("type", "Type de barre a afficher (1=objet, 2=sort, 0 pour inverser)", akg_2.e, false)};
    static final akf_1[] bi = new akf_1[]{new akf_1("dialog", "Nom de l'interface", akg_2.c, false), new akf_1("widget", "Nom du widget de l'interface", akg_2.c, true)};
    static final akf_1[] bj = new akf_1[]{new akf_1("dialogName", "Dialog name", akg_2.c, false), new akf_1("widgetId", "Widget name", akg_2.c, false), new akf_1("text", "text", akg_2.c, false)};
    static final THashSet<String> bk = new THashSet();
    private static final dir_0 bl = new dir_0();
    static int bm;
    final TIntObjectHashMap<fbx_1> d = new TIntObjectHashMap();

    private dir_0() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new djb_0(luaState), new djb(luaState), new dks(luaState), new djJ(luaState), new dit_0(luaState), new dko(luaState), new djf(luaState), new dkv(luaState), new dim_0(luaState), new din_0(luaState), new dkx(luaState), new djp(luaState), new djq(luaState), new djz_0(luaState), new dlc(luaState), new djk_0(luaState), new dkD(luaState), new djl(luaState), new dkc_0(luaState), new dkh(luaState), new dki(luaState), new dke(luaState), new dkd_0(luaState), new djg_0(luaState), new dkq_0(luaState), new dkP(luaState), new dkr_0(luaState), new djh_0(luaState), new dio_0(luaState), new djo_0(luaState), new djn_0(luaState), new djm_0(luaState), new dja_0(luaState), new diz_0(luaState), new djj_0(luaState), new dkL(luaState), new dkf(luaState), new djr(luaState), new dji_0(luaState), new dkW(luaState), new div_0(luaState), new dkq(luaState), new dix_0(luaState), new dkr(luaState), new djq_0(luaState), new dkU(luaState), new dkv_0(luaState), new dkz_0(luaState), new dkK(luaState), new djs_0(luaState), new dkw_0(luaState), new dkA(luaState), new dkb_0(luaState), new djw_0(luaState), new dkt_0(luaState), new dlb(luaState), new djl_0(luaState), new djK(luaState), new dkt(luaState), new dks_0(luaState), new dje_0(luaState), new djD(luaState), new djO(luaState), new djx_0(luaState), new djY(luaState), new djc(luaState), new dkh_0(luaState), new dki_0(luaState), new dke_0(luaState), new dky(luaState), new dkl_0(luaState), new dkf_0(luaState), new djr_0(luaState), new djt_0(luaState), new djS(luaState), new dlg(luaState), new dli(luaState), new dlh(luaState), new djc_0(luaState), new dip_0(luaState), new djv_0(luaState), new djt(luaState), new djf_0(luaState), new dkZ(luaState), new djz(luaState), new djy_0(luaState), new dld(luaState), new djW(luaState), new djA(luaState), new dji(luaState), new dkC(luaState), new dkn(luaState), new dkk_0(luaState), new djd_0(luaState), new djM(luaState), new djv(luaState), new dkx_0(luaState), new dla(luaState), new dje(luaState), new dku_0(luaState), new dky_0(luaState), new dkn_0(luaState), new diu_0(luaState), new dkp_0(luaState), new djG(luaState), new dkj_0(luaState), new djh(luaState), new dkg_0(luaState), new dkb(luaState), new dlf(luaState), new dis_0(luaState), new dju_0(luaState), new djU(luaState), new djp_0(luaState), new dkJ(luaState), new dkG(luaState), new djN(luaState), new diq_0(luaState), new dko_0(luaState), new dka_0(luaState), new dle(luaState)};
    }

    @Override
    @Nullable
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    public void d() {
        TIntObjectIterator tIntObjectIterator = this.d.iterator();
        for (int k = this.d.size(); k > 0; --k) {
            tIntObjectIterator.advance();
            ((fbx_1)tIntObjectIterator.value()).setTimeToLive(0);
        }
        this.d.clear();
        bm = 0;
        dim_0.g();
        bk.forEach(string -> {
            fis_1.a().a((String)string);
            return true;
        });
    }

    @Override
    public final String a() {
        return "UI";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public static dir_0 e() {
        return bl;
    }

    static String a(int n) {
        return "characterDialog" + n;
    }
}

