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
 * Renamed from iY
 */
public final class iy_0
extends GeneratedMessageV3
implements jb_0 {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    int h;
    public static final int b = 2;
    int i;
    public static final int c = 3;
    boolean j;
    public static final int d = 4;
    boolean k;
    private byte l = (byte)-1;
    private static final iy_0 m = new iy_0();
    @Deprecated
    public static final Parser<iy_0> e = new iz_0();

    iy_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iy_0() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.k = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iy_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block13;
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.g |= 1;
                        this.h = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        this.g |= 2;
                        this.i = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.g |= 4;
                        this.j = codedInputStream.readBool();
                        continue block13;
                    }
                    case 32: 
                }
                this.g |= 8;
                this.k = codedInputStream.readBool();
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
        return iw_0.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.j.ensureFieldAccessorsInitialized(iy_0.class, ja.class);
    }

    @Override
    public boolean b() {
        return (this.g & 1) == 1;
    }

    @Override
    public int c() {
        return this.h;
    }

    @Override
    public boolean d() {
        return (this.g & 2) == 2;
    }

    @Override
    public int e() {
        return this.i;
    }

    @Override
    public boolean f() {
        return (this.g & 4) == 4;
    }

    @Override
    public boolean g() {
        return this.j;
    }

    @Override
    public boolean h() {
        return (this.g & 8) == 8;
    }

    @Override
    public boolean i() {
        return this.k;
    }

    public final boolean isInitialized() {
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.l = 0;
            return false;
        }
        if (!this.d()) {
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.g & 1) == 1) {
            codedOutputStream.writeInt32(1, this.h);
        }
        if ((this.g & 2) == 2) {
            codedOutputStream.writeInt32(2, this.i);
        }
        if ((this.g & 4) == 4) {
            codedOutputStream.writeBool(3, this.j);
        }
        if ((this.g & 8) == 8) {
            codedOutputStream.writeBool(4, this.k);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.g & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.h);
        }
        if ((this.g & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.i);
        }
        if ((this.g & 4) == 4) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.j);
        }
        if ((this.g & 8) == 8) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.k);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iy_0)) {
            return super.equals(object);
        }
        iy_0 iy_02 = (iy_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == iy_02.b();
        if (this.b()) {
            bl = bl && this.c() == iy_02.c();
        }
        boolean bl3 = bl = bl && this.d() == iy_02.d();
        if (this.d()) {
            bl = bl && this.e() == iy_02.e();
        }
        boolean bl4 = bl = bl && this.f() == iy_02.f();
        if (this.f()) {
            bl = bl && this.g() == iy_02.g();
        }
        boolean bl5 = bl = bl && this.h() == iy_02.h();
        if (this.h()) {
            bl = bl && this.i() == iy_02.i();
        }
        bl = bl && this.unknownFields.equals((Object)iy_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iy_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.g());
        }
        if (this.h()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.i());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static iy_0 a(ByteBuffer byteBuffer) {
        return (iy_0)e.parseFrom(byteBuffer);
    }

    public static iy_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_0)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iy_0 a(ByteString byteString) {
        return (iy_0)e.parseFrom(byteString);
    }

    public static iy_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_0)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static iy_0 a(byte[] byArray) {
        return (iy_0)e.parseFrom(byArray);
    }

    public static iy_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_0)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static iy_0 a(InputStream inputStream) {
        return (iy_0)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static iy_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_0)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iy_0 b(InputStream inputStream) {
        return (iy_0)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static iy_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_0)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iy_0 a(CodedInputStream codedInputStream) {
        return (iy_0)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static iy_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_0)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ja j() {
        return iy_0.k();
    }

    public static ja k() {
        return m.l();
    }

    public static ja a(iy_0 iy_02) {
        return m.l().a(iy_02);
    }

    public ja l() {
        return this == m ? new ja() : new ja().a(this);
    }

    protected ja a(GeneratedMessageV3.BuilderParent builderParent) {
        ja ja2 = new ja(builderParent);
        return ja2;
    }

    public static iy_0 m() {
        return m;
    }

    public static Parser<iy_0> n() {
        return e;
    }

    public Parser<iy_0> getParserForType() {
        return e;
    }

    public iy_0 o() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(iy_0 iy_02) {
        return iy_02.unknownFields;
    }
}

