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
 *  com.google.protobuf.MapField
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
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from hp
 */
public final class hp_0
extends GeneratedMessageV3.Builder<hp_0>
implements hv_0 {
    private int a;
    private MapField<Long, hr_0> b;

    public static final Descriptors.Descriptor a() {
        return hl_0.c;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.m();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.n();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hl_0.d.ensureFieldAccessorsInitialized(hn_0.class, hp_0.class);
    }

    hp_0() {
        this.l();
    }

    hp_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (hn_0.k()) {
            // empty if block
        }
    }

    public hp_0 e() {
        super.clear();
        this.n().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hl_0.c;
    }

    public hn_0 f() {
        return hn_0.h();
    }

    public hn_0 g() {
        hn_0 hn_02 = this.h();
        if (!hn_02.isInitialized()) {
            throw hp_0.newUninitializedMessageException((Message)hn_02);
        }
        return hn_02;
    }

    public hn_0 h() {
        hn_0 hn_02 = new hn_0(this);
        int n = this.a;
        hn_02.d = this.m();
        hn_02.d.makeImmutable();
        this.onBuilt();
        return hn_02;
    }

    public hp_0 i() {
        return (hp_0)super.clone();
    }

    public hp_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hp_0)super.setField(fieldDescriptor, object);
    }

    public hp_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hp_0)super.clearField(fieldDescriptor);
    }

    public hp_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hp_0)super.clearOneof(oneofDescriptor);
    }

    public hp_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hp_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hp_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hp_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public hp_0 a(Message message) {
        if (message instanceof hn_0) {
            return this.a((hn_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hp_0 a(hn_0 hn_02) {
        if (hn_02 == hn_0.h()) {
            return this;
        }
        this.n().mergeFrom(hn_02.l());
        this.b(hn_0.b(hn_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (hr_0 hr_02 : this.d().values()) {
            if (hr_02.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public hp_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hn_0 hn_02 = null;
        try {
            hn_02 = (hn_0)hn_0.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hn_02 = (hn_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hn_02 != null) {
                this.a(hn_02);
            }
        }
        return this;
    }

    private MapField<Long, hr_0> m() {
        if (this.b == null) {
            return MapField.emptyMapField(hq_0.a);
        }
        return this.b;
    }

    private MapField<Long, hr_0> n() {
        this.onChanged();
        if (this.b == null) {
            this.b = MapField.newMapField(hq_0.a);
        }
        if (!this.b.isMutable()) {
            this.b = this.b.copy();
        }
        return this.b;
    }

    @Override
    public int b() {
        return this.m().getMap().size();
    }

    @Override
    public boolean a(long l) {
        return this.m().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, hr_0> c() {
        return this.d();
    }

    @Override
    public Map<Long, hr_0> d() {
        return this.m().getMap();
    }

    @Override
    public hr_0 a(long l, hr_0 hr_02) {
        Map map = this.m().getMap();
        return map.containsKey(l) ? (hr_0)map.get(l) : hr_02;
    }

    @Override
    public hr_0 b(long l) {
        Map map = this.m().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (hr_0)map.get(l);
    }

    public hp_0 j() {
        this.n().getMutableMap().clear();
        return this;
    }

    public hp_0 c(long l) {
        this.n().getMutableMap().remove(l);
        return this;
    }

    @Deprecated
    public Map<Long, hr_0> k() {
        return this.n().getMutableMap();
    }

    public hp_0 b(long l, hr_0 hr_02) {
        if (hr_02 == null) {
            throw new NullPointerException();
        }
        this.n().getMutableMap().put(l, hr_02);
        return this;
    }

    public hp_0 a(Map<Long, hr_0> map) {
        this.n().getMutableMap().putAll(map);
        return this;
    }

    public final hp_0 a(UnknownFieldSet unknownFieldSet) {
        return (hp_0)super.setUnknownFields(unknownFieldSet);
    }

    public final hp_0 b(UnknownFieldSet unknownFieldSet) {
        return (hp_0)super.mergeUnknownFields(unknownFieldSet);
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

