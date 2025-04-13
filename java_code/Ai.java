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

public final class Ai
extends GeneratedMessageV3
implements Al {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    int h;
    public static final int b = 2;
    int i;
    public static final int c = 3;
    int j;
    public static final int d = 4;
    boolean k;
    private byte l = (byte)-1;
    private static final Ai m = new Ai();
    @Deprecated
    public static final Parser<Ai> e = new Aj();

    Ai(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Ai() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Ai(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.j = codedInputStream.readInt32();
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
        return zy_1.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zy_1.f.ensureFieldAccessorsInitialized(Ai.class, Ak.class);
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
    public int g() {
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
        if (!this.f()) {
            this.l = 0;
            return false;
        }
        if (!this.h()) {
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
            codedOutputStream.writeInt32(3, this.j);
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
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.j);
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
        if (!(object instanceof Ai)) {
            return super.equals(object);
        }
        Ai ai = (Ai)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ai.b();
        if (this.b()) {
            bl = bl && this.c() == ai.c();
        }
        boolean bl3 = bl = bl && this.d() == ai.d();
        if (this.d()) {
            bl = bl && this.e() == ai.e();
        }
        boolean bl4 = bl = bl && this.f() == ai.f();
        if (this.f()) {
            bl = bl && this.g() == ai.g();
        }
        boolean bl5 = bl = bl && this.h() == ai.h();
        if (this.h()) {
            bl = bl && this.i() == ai.i();
        }
        bl = bl && this.unknownFields.equals((Object)ai.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Ai.a().hashCode();
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
            n = 53 * n + this.g();
        }
        if (this.h()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.i());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Ai a(ByteBuffer byteBuffer) {
        return (Ai)e.parseFrom(byteBuffer);
    }

    public static Ai a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Ai)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Ai a(ByteString byteString) {
        return (Ai)e.parseFrom(byteString);
    }

    public static Ai a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Ai)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static Ai a(byte[] byArray) {
        return (Ai)e.parseFrom(byArray);
    }

    public static Ai a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Ai)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static Ai a(InputStream inputStream) {
        return (Ai)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static Ai a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Ai)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Ai b(InputStream inputStream) {
        return (Ai)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static Ai b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Ai)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Ai a(CodedInputStream codedInputStream) {
        return (Ai)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static Ai a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Ai)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public Ak j() {
        return Ai.k();
    }

    public static Ak k() {
        return m.l();
    }

    public static Ak a(Ai ai) {
        return m.l().a(ai);
    }

    public Ak l() {
        return this == m ? new Ak() : new Ak().a(this);
    }

    protected Ak a(GeneratedMessageV3.BuilderParent builderParent) {
        Ak ak = new Ak(builderParent);
        return ak;
    }

    public static Ai m() {
        return m;
    }

    public static Parser<Ai> n() {
        return e;
    }

    public Parser<Ai> getParserForType() {
        return e;
    }

    public Ai o() {
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

    static /* synthetic */ UnknownFieldSet b(Ai ai) {
        return ai.unknownFields;
    }
}

