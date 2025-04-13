/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from db
 */
public final class db_2
extends GeneratedMessageV3.Builder<db_2>
implements dc_2 {
    private long a;
    private int b = 0;

    public static final Descriptors.Descriptor a() {
        return ak_2.A;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.B.ensureFieldAccessorsInitialized(cz_1.class, db_2.class);
    }

    db_2() {
        this.l();
    }

    db_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (cz_1.k()) {
            // empty if block
        }
    }

    public db_2 e() {
        super.clear();
        this.a = 0L;
        this.b = 0;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.A;
    }

    public cz_1 f() {
        return cz_1.h();
    }

    public cz_1 g() {
        cz_1 cz_12 = this.h();
        if (!cz_12.isInitialized()) {
            throw db_2.newUninitializedMessageException((Message)cz_12);
        }
        return cz_12;
    }

    public cz_1 h() {
        cz_1 cz_12 = new cz_1(this);
        cz_12.d = this.a;
        cz_12.e = this.b;
        this.onBuilt();
        return cz_12;
    }

    public db_2 i() {
        return (db_2)super.clone();
    }

    public db_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (db_2)super.setField(fieldDescriptor, object);
    }

    public db_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (db_2)super.clearField(fieldDescriptor);
    }

    public db_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (db_2)super.clearOneof(oneofDescriptor);
    }

    public db_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (db_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public db_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (db_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public db_2 a(Message message) {
        if (message instanceof cz_1) {
            return this.a((cz_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public db_2 a(cz_1 cz_12) {
        if (cz_12 == cz_1.h()) {
            return this;
        }
        if (cz_12.b() != 0L) {
            this.a(cz_12.b());
        }
        if (cz_12.e != 0) {
            this.a(cz_12.c());
        }
        this.b(cz_1.b(cz_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public db_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cz_1 cz_12 = null;
        try {
            cz_12 = (cz_1)cz_1.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cz_12 = (cz_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cz_12 != null) {
                this.a(cz_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public db_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public db_2 j() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public int c() {
        return this.b;
    }

    public db_2 a(int n) {
        this.b = n;
        this.onChanged();
        return this;
    }

    @Override
    public cx_1 d() {
        cx_1 cx_12 = cx_1.a(this.b);
        return cx_12 == null ? cx_1.d : cx_12;
    }

    public db_2 a(cx_1 cx_12) {
        if (cx_12 == null) {
            throw new NullPointerException();
        }
        this.b = cx_12.getNumber();
        this.onChanged();
        return this;
    }

    public db_2 k() {
        this.b = 0;
        this.onChanged();
        return this;
    }

    public final db_2 a(UnknownFieldSet unknownFieldSet) {
        return (db_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final db_2 b(UnknownFieldSet unknownFieldSet) {
        return (db_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

