import React, { useState } from 'react';

const InputP = () => {

    const [name, setName] = useState('');

    return (
        <div>

        <input type="text" onChange={ e => setName(e.target.value) } />
        <button onClick={name}>보내기</button>

        <h2>{name}</h2>

        </div>
    );
};

    

export default InputP;
