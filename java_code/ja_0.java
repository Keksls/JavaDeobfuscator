/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from jA
 */
public final class ja_0
extends GeneratedMessageV3
implements jD {
    private static final long i = 0L;
    int j;
    public static final int a = 1;
    long k;
    public static final int b = 2;
    long l;
    public static final int c = 4;
    boolean m;
    public static final int d = 5;
    int n;
    public static final int e = 6;
    int o;
    public static final int f = 7;
    int p;
    public static final int g = 8;
    long q;
    private byte r = (byte)-1;
    private static final ja_0 s = new ja_0();
    @Deprecated
    public static final Parser<ja_0> h = new jB();

    ja_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ja_0() {
        this.k = 0L;
        this.l = 0L;
        this.m = false;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ja_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block16: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block16;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block16;
                        bl2 = true;
                        continue block16;
                    }
                    case 8: {
                        this.j |= 1;
                        this.k = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 16: {
                        this.j |= 2;
                        this.l = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 32: {
                        this.j |= 4;
                        this.m = codedInputStream.readBool();
                        continue block16;
                    }
                    case 40: {
                        this.j |= 8;
                        this.n = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 48: {
                        this.j |= 0x10;
                        this.o = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 56: {
                        this.j |= 0x20;
                        this.p = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 64: 
                }
                this.j |= 0x40;
                this.q = codedInputStream.readInt64();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return iw_0.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.l.ensureFieldAccessorsInitialized(ja_0.class, jC.class);
    }

    @Override
    public boolean b() {
        return (this.j & 1) == 1;
    }

    @Override
    public long c() {
        return this.k;
    }

    @Override
    public boolean d() {
        return (this.j & 2) == 2;
    }

    @Override
    public long e() {
        return this.l;
    }

    @Override
    public boolean f() {
        return (this.j & 4) == 4;
    }

    @Override
    public boolean g() {
        return this.m;
    }

    @Override
    public boolean h() {
        return (this.j & 8) == 8;
    }

    @Override
    public int i() {
        return this.n;
    }

    @Override
    public boolean j() {
        return (this.j & 0x10) == 16;
    }

    @Override
    public int k() {
        return this.o;
    }

    @Override
    public boolean l() {
        return (this.j & 0x20) == 32;
    }

    @Override
    public int m() {
        return this.p;
    }

    @Override
    public boolean n() {
        return (this.j & 0x40) == 64;
    }

    @Override
    public long o() {
        return this.q;
    }

    public final boolean isInitialized() {
        byte by = this.r;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.r = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.j & 1) == 1) {
            codedOutputStream.writeInt64(1, this.k);
        }
        if ((this.j & 2) == 2) {
            codedOutputStream.writeInt64(2, this.l);
        }
        if ((this.j & 4) == 4) {
            codedOutputStream.writeBool(4, this.m);
        }
        if ((this.j & 8) == 8) {
            codedOutputStream.writeInt32(5, this.n);
        }
        if ((this.j & 0x10) == 16) {
            codedOutputStream.writeInt32(6, this.o);
        }
        if ((this.j & 0x20) == 32) {
            codedOutputStream.writeInt32(7, this.p);
        }
        if ((this.j & 0x40) == 64) {
            codedOutputStream.writeInt64(8, this.q);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.j & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.k);
        }
        if ((this.j & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.l);
        }
        if ((this.j & 4) == 4) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.m);
        }
        if ((this.j & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.n);
        }
        if ((this.j & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.o);
        }
        if ((this.j & 0x20) == 32) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.p);
        }
        if ((this.j & 0x40) == 64) {
            n += CodedOutputStream.computeInt64Size((int)8, (long)this.q);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ja_0)) {
            return super.equals(object);
        }
        ja_0 ja_02 = (ja_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ja_02.b();
        if (this.b()) {
            bl = bl && this.c() == ja_02.c();
        }
        boolean bl3 = bl = bl && this.d() == ja_02.d();
        if (this.d()) {
            bl = bl && this.e() == ja_02.e();
        }
        boolean bl4 = bl = bl && this.f() == ja_02.f();
        if (this.f()) {
            bl = bl && this.g() == ja_02.g();
        }
        boolean bl5 = bl = bl && this.h() == ja_02.h();
        if (this.h()) {
            bl = bl && this.i() == ja_02.i();
        }
        boolean bl6 = bl = bl && this.j() == ja_02.j();
        if (this.j()) {
            bl = bl && this.k() == ja_02.k();
        }
        boolean bl7 = bl = bl && this.l() == ja_02.l();
        if (this.l()) {
            bl = bl && this.m() == ja_02.m();
        }
        boolean bl8 = bl = bl && this.n() == ja_02.n();
        if (this.n()) {
            bl = bl && this.o() == ja_02.o();
        }
        bl = bl && this.unknownFields.equals((Object)ja_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ja_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.e());
        }
        if (this.f()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.g());
        }
        if (this.h()) {
            n = 37 * n + 5;
            n = 53 * n + this.i();
        }
        if (this.j()) {
            n = 37 * n + 6;
            n = 53 * n + this.k();
        }
        if (this.l()) {
            n = 37 * n + 7;
            n = 53 * n + this.m();
        }
        if (this.n()) {
            n = 37 * n + 8;
            n = 53 * n + Internal.hashLong((long)this.o());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ja_0 a(ByteBuffer byteBuffer) {
        return (ja_0)h.parseFrom(byteBuffer);
    }

    public static ja_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ja_0)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ja_0 a(ByteString byteString) {
        return (ja_0)h.parseFrom(byteString);
    }

    public static ja_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ja_0)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static ja_0 a(byte[] byArray) {
        return (ja_0)h.parseFrom(byArray);
    }

    public static ja_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ja_0)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static ja_0 a(InputStream inputStream) {
        return (ja_0)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static ja_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ja_0)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ja_0 b(InputStream inputStream) {
        return (ja_0)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static ja_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ja_0)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ja_0 a(CodedInputStream codedInputStream) {
        return (ja_0)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static ja_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ja_0)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jC p() {
        return ja_0.q();
    }

    public static jC q() {
        return s.r();
    }

    public static jC a(ja_0 ja_02) {
        return s.r().a(ja_02);
    }

    public jC r() {
        return this == s ? new jC() : new jC().a(this);
    }

    protected jC a(GeneratedMessageV3.BuilderParent builderParent) {
        jC jC2 = new jC(builderParent);
        return jC2;
    }

    public static ja_0 s() {
        return s;
    }

    public static Parser<ja_0> t() {
        return h;
    }

    public Parser<ja_0> getParserForType() {
        return h;
    }

    public ja_0 u() {
        return s;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.r();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.p();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.u();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.u();
    }

    static /* synthetic */ boolean v() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ja_0 ja_02) {
        return ja_02.unknownFields;
    }
}

