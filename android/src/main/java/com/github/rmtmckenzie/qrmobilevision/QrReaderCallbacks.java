package com.github.rmtmckenzie.qrmobilevision;

public interface QrReaderCallbacks {
    void qrRead(String str, byte[] data);
}
