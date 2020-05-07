package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.BindingData;
import com.inf191.lachesis.generate.PatientsFitbit;

public interface BindingDataService {
    PatientsFitbit signinBindingInfo(BindingData bindingData);
    int signoffBinding(PatientsFitbit patientsFitbit);
}
