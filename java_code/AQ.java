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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AQ
extends GeneratedMessageV3
implements AX {
    private static final long c = 0L;
    public static final int a = 1;
    List<AT> d;
    private byte e = (byte)-1;
    private static final AQ f = new AQ();
    @Deprecated
    public static final Parser<AQ> b = new AR();

    AQ(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private AQ() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    AQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                if (!(bl & true)) {
                    this.d = new ArrayList<AT>();
                    bl |= true;
                }
                this.d.add((AT)codedInputStream.readMessage(AT.c, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.d = Collections.unmodifiableList(this.d);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return AO.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.b.ensureFieldAccessorsInitialized(AQ.class, AS.class);
    }

    @Override
    public List<AT> b() {
        return this.d;
    }

    @Override
    public List<? extends AW> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public AT a(int n) {
        return this.d.get(n);
    }

    @Override
    public AW b(int n) {
        return this.d.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.e = 0;
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.d.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.d.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.d.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.d.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof AQ)) {
            return super.equals(object);
        }
        AQ aQ = (AQ)object;
        boolean bl = true;
        bl = bl && this.b().equals(aQ.b());
        bl = bl && this.unknownFields.equals((Object)aQ.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + AQ.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static AQ a(ByteBuffer byteBuffer) {
        return (AQ)b.parseFrom(byteBuffer);
    }

    public static AQ a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AQ)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AQ a(ByteString byteString) {
        return (AQ)b.parseFrom(byteString);
    }

    public static AQ a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AQ)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static AQ a(byte[] byArray) {
        return (AQ)b.parseFrom(byArray);
    }

    public static AQ a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AQ)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static AQ a(InputStream inputStream) {
        return (AQ)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static AQ a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AQ)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AQ b(InputStream inputStream) {
        return (AQ)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static AQ b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AQ)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AQ a(CodedInputStream codedInputStream) {
        return (AQ)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static AQ a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AQ)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public AS e() {
        return AQ.f();
    }

    public static AS f() {
        return f.g();
    }

    public static AS a(AQ aQ) {
        return f.g().a(aQ);
    }

    public AS g() {
        return this == f ? new AS() : new AS().a(this);
    }

    protected AS a(GeneratedMessageV3.BuilderParent builderParent) {
        AS aS = new AS(builderParent);
        return aS;
    }

    public static AQ h() {
        return f;
    }

    public static Parser<AQ> i() {
        return b;
    }

    public Parser<AQ> getParserForType() {
        return b;
    }

    public AQ j() {
        return f;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(AQ aQ) {
        return aQ.unknownFields;
    }
}

