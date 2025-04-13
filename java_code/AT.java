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

public final class AT
extends GeneratedMessageV3
implements AW {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    long f;
    public static final int b = 2;
    bl_0 g;
    private byte h = (byte)-1;
    private static final AT i = new AT();
    @Deprecated
    public static final Parser<AT> c = new AU();

    AT(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private AT() {
        this.f = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    AT(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 18: 
                }
                BN bN = null;
                if ((this.e & 2) == 2) {
                    bN = this.g.t();
                }
                this.g = (bl_0)codedInputStream.readMessage(bl_0.g, extensionRegistryLite);
                if (bN != null) {
                    bN.a(this.g);
                    this.g = bN.u();
                }
                this.e |= 2;
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
        return AO.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.d.ensureFieldAccessorsInitialized(AT.class, AV.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public bl_0 e() {
        return this.g == null ? bl_0.u() : this.g;
    }

    @Override
    public BO f() {
        return this.g == null ? bl_0.u() : this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        if (!this.d()) {
            this.h = 0;
            return false;
        }
        if (!this.e().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt64(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof AT)) {
            return super.equals(object);
        }
        AT aT = (AT)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == aT.b();
        if (this.b()) {
            bl = bl && this.c() == aT.c();
        }
        boolean bl3 = bl = bl && this.d() == aT.d();
        if (this.d()) {
            bl = bl && this.e().equals(aT.e());
        }
        bl = bl && this.unknownFields.equals((Object)aT.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + AT.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static AT a(ByteBuffer byteBuffer) {
        return (AT)c.parseFrom(byteBuffer);
    }

    public static AT a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AT)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AT a(ByteString byteString) {
        return (AT)c.parseFrom(byteString);
    }

    public static AT a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AT)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static AT a(byte[] byArray) {
        return (AT)c.parseFrom(byArray);
    }

    public static AT a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AT)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static AT a(InputStream inputStream) {
        return (AT)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static AT a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AT)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AT b(InputStream inputStream) {
        return (AT)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static AT b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AT)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AT a(CodedInputStream codedInputStream) {
        return (AT)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static AT a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AT)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public AV g() {
        return AT.h();
    }

    public static AV h() {
        return i.i();
    }

    public static AV a(AT aT) {
        return i.i().a(aT);
    }

    public AV i() {
        return this == i ? new AV() : new AV().a(this);
    }

    protected AV a(GeneratedMessageV3.BuilderParent builderParent) {
        AV aV = new AV(builderParent);
        return aV;
    }

    public static AT j() {
        return i;
    }

    public static Parser<AT> k() {
        return c;
    }

    public Parser<AT> getParserForType() {
        return c;
    }

    public AT l() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(AT aT) {
        return aT.unknownFields;
    }
}

