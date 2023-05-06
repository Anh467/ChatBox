const form = document.getElementById("chat-form");
const submitform = document.getElementById("cal");
const input = document.getElementById("chat-input");
const messages = document.getElementById("chat-messages");
const uid = document.getElementById("uid");
const apiKey = "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";

form.addEventListener("submit", async (e) => {
    e.preventDefault();
    const message = input.value;
    input.value = "";

    messages.innerHTML += ``;

    // Use axios library to make a POST request to the OpenAI API
    const response = await axios.post(
            "https://api.openai.com/v1/completions",
            {
                prompt: message,
                model: "text-davinci-003",
                temperature: 0,
                max_tokens: 1000,
                top_p: 1,
                frequency_penalty: 0.0,
                presence_penalty: 0.0
            },
            {
                headers: {
                    "Content-Type": "application/json",
                    Authorization: `Bearer ${apiKey}`
                }
            }
    );
    const chatbotResponse = response.data.choices[0].text;
    messages.innerHTML += ` <div>
                                    <div class="message user-message">
                                        <img src="./icons/user.png" alt="user icon"> <span>${message}</span>
                                    </div>
                                    <div class="message bot-message" style="position: relative;">
                                        <img src="./icons/chatbot.png" alt="bot icon"> <span>${chatbotResponse}</span>
                                        <div class="iconPost" onclick="toggleMenu(this)">
                                            <div class="sub-menu-wrap">
                                                <div class="sub-menu">
                                                    <button class="sub-menu-link" style="background: none; border: none" onclick="openNewWindow('../block/share.jsp', '?user=${message}&chat=${chatbotResponse.replace(/[\r\n]+/g, '')}')">
                                                        <p>POST</p>
                                                    </button>
                                                </div>
                                            </div>  
                                        </div>
                                    </div>
                            </div>`;    
//    submitform.innerHTML = `<input type="text" value="${message}" name="user">
//                <input type="text" value="${chatbotResponse}" name="chat">
//                <input type="submit" value="enter">`;
    
    $.ajax({
        url: '/ResconnectChatBot/Save',
        type: 'get',
        data: {user: message,
            chat: chatbotResponse
        },
        success: function (result) {
        },
        error: function (xhr) {
            alert("st wrong");
        }
    });
    
    const win = document.getElementById("chat-messages");
    win.scrollTo(0,document.body.scrollHeight);
    //$('#chat-messages').scrollTop($('#chat-messages')[0].scrollHeight);
});