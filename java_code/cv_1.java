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
 * Renamed from cV
 */
public final class cv_1
extends GeneratedMessageV3.Builder<cv_1>
implements cw_1 {
    private long a;
    private int b = 0;

    public static final Descriptors.Descriptor a() {
        return ak_2.y;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.z.ensureFieldAccessorsInitialized(ct_2.class, cv_1.class);
    }

    cv_1() {
        this.l();
    }

    cv_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (ct_2.k()) {
            // empty if block
        }
    }

    public cv_1 e() {
        super.clear();
        this.a = 0L;
        this.b = 0;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.y;
    }

    public ct_2 f() {
        return ct_2.h();
    }

    public ct_2 g() {
        ct_2 ct_22 = this.h();
        if (!ct_22.isInitialized()) {
            throw cv_1.newUninitializedMessageException((Message)ct_22);
        }
        return ct_22;
    }

    public ct_2 h() {
        ct_2 ct_22 = new ct_2(this);
        ct_22.d = this.a;
        ct_22.e = this.b;
        this.onBuilt();
        return ct_22;
    }

    public cv_1 i() {
        return (cv_1)super.clone();
    }

    public cv_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cv_1)super.setField(fieldDescriptor, object);
    }

    public cv_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cv_1)super.clearField(fieldDescriptor);
    }

    public cv_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cv_1)super.clearOneof(oneofDescriptor);
    }

    public cv_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cv_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cv_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cv_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public cv_1 a(Message message) {
        if (message instanceof ct_2) {
            return this.a((ct_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cv_1 a(ct_2 ct_22) {
        if (ct_22 == ct_2.h()) {
            return this;
        }
        if (ct_22.b() != 0L) {
            this.a(ct_22.b());
        }
        if (ct_22.e != 0) {
            this.a(ct_22.c());
        }
        this.b(ct_2.b(ct_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cv_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ct_2 ct_22 = null;
        try {
            ct_22 = (ct_2)ct_2.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ct_22 = (ct_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ct_22 != null) {
                this.a(ct_22);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public cv_1 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public cv_1 j() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public int c() {
        return this.b;
    }

    public cv_1 a(int n) {
        this.b = n;
        this.onChanged();
        return this;
    }

    @Override
    public cr_2 d() {
        cr_2 cr_22 = cr_2.a(this.b);
        return cr_22 == null ? cr_2.c : cr_22;
    }

    public cv_1 a(cr_2 cr_22) {
        if (cr_22 == null) {
            throw new NullPointerException();
        }
        this.b = cr_22.getNumber();
        this.onChanged();
        return this;
    }

    public cv_1 k() {
        this.b = 0;
        this.onChanged();
        return this;
    }

    public final cv_1 a(UnknownFieldSet unknownFieldSet) {
        return (cv_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final cv_1 b(UnknownFieldSet unknownFieldSet) {
        return (cv_1)super.mergeUnknownFields(unknownFieldSet);
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

