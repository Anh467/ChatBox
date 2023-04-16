const form = document.getElementById("chat-form");
const submitform = document.getElementById("cal");
const input = document.getElementById("chat-input");
const messages = document.getElementById("chat-messages");
const apiKey = "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";
function load_servlet() {
                document.getElementById('cal').action= "../Save";
                document.getElementById('cal').method= 'GET';
                document.getElementById('cal').submit();
            }
form.addEventListener("submit", async (e) => {
  e.preventDefault();
  const message = input.value;
  input.value = "";

  messages.innerHTML += `<div class="message user-message">
  <img src="./icons/user.png" alt="user icon"> <span>${message}</span>
  </div>`;

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
      presence_penalty: 0.0,
    },
    {
      headers: {
        "Content-Type": "application/json",
        Authorization: `Bearer ${apiKey}`,
      },
    }
  );
  const chatbotResponse = response.data.choices[0].text;
  messages.innerHTML += `<div class="message bot-message">
  <img src="./icons/chatbot.png" alt="bot icon"> <span>${chatbotResponse}</span>
  </div>`;
    submitform.innerHTML= `<input type="text" value="${message}" name="user">
                <input type="text" value="${chatbotResponse}" name="chat">
                <input type="submit" value="enter">`;
  load_servlet();
});
